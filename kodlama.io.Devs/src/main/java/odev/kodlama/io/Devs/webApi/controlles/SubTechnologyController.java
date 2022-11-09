package odev.kodlama.io.Devs.webApi.controlles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import odev.kodlama.io.Devs.business.abstracts.SubTechnologyService;
import odev.kodlama.io.Devs.business.request.subTechnologyRequest.AddRequestSubTechnology;
import odev.kodlama.io.Devs.business.request.subTechnologyRequest.DeleteRequestSubTechnology;
import odev.kodlama.io.Devs.business.request.subTechnologyRequest.UpdateRequestSubTechnology;
import odev.kodlama.io.Devs.business.response.subTechnologyResponse.GetAllResponseSubTechnology;
import odev.kodlama.io.Devs.business.response.subTechnologyResponse.GetByIdResponseSubTechnology;
@RestController
@RequestMapping("/api/subTechnology")
public class SubTechnologyController {
	private SubTechnologyService subTechnologyService;
	@Autowired
	public SubTechnologyController(SubTechnologyService subTechnologyService) {
		this.subTechnologyService=subTechnologyService;
		
	}
	@GetMapping("/getAll")
	public List<GetAllResponseSubTechnology> getAll(){
		return this.subTechnologyService.getAll();
	}

	@PostMapping("/add")
	public void add(AddRequestSubTechnology addRequestSubTechnology) {
		this.subTechnologyService.add(addRequestSubTechnology);
	}
	@GetMapping("/{id}")
	GetByIdResponseSubTechnology getById(@PathVariable int id) {
		return this.subTechnologyService.getById(id);
	}
	@DeleteMapping("/delete")
	public void delete(DeleteRequestSubTechnology deleteRequestSubTechnology) {
		this.subTechnologyService.delete(deleteRequestSubTechnology);
	}
	@PutMapping("/update")
	public void update(UpdateRequestSubTechnology updateRequestSubTechnology) {
		this.subTechnologyService.update(updateRequestSubTechnology);
	}
}
