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

import odev.kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import odev.kodlama.io.Devs.business.request.programmingRequest.AddRequestProgrammingLanguage;
import odev.kodlama.io.Devs.business.request.programmingRequest.DeleteRequestProgrammingLanguage;
import odev.kodlama.io.Devs.business.request.programmingRequest.UpdateRequestProgrammingLanguage;
import odev.kodlama.io.Devs.business.response.programmingResponse.GetAllReponseProgrammingLanguage;
import odev.kodlama.io.Devs.business.response.programmingResponse.GetByIdReponseProgrammingLanguage;
import odev.kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
@RestController
@RequestMapping("/api/ProgrammingLanguage")
public class ProgrammingLanguageController {
	private ProgrammingLanguageService programmingLanguageService;
	@Autowired
	public ProgrammingLanguageController(ProgrammingLanguageService programmingLanguageService) {
		this.programmingLanguageService=programmingLanguageService;
		
	}
	@GetMapping("/getAll")
	public List<GetAllReponseProgrammingLanguage> getAll(){
		return this.programmingLanguageService.getAll();
	}
	
	@GetMapping("/{id}")
	GetByIdReponseProgrammingLanguage byId(@PathVariable int id) {
		return programmingLanguageService.getById(id);
	}
	
	@PostMapping("/add")
	public void add(AddRequestProgrammingLanguage addRequestProgrammingLanguage) {
		programmingLanguageService.add(addRequestProgrammingLanguage);
	}
	@DeleteMapping("/delete")
	public void delete(DeleteRequestProgrammingLanguage deleteRequestProgrammingLanguage) {
		programmingLanguageService.delete(deleteRequestProgrammingLanguage);
	}
	@PutMapping("/update")
public void update(UpdateRequestProgrammingLanguage updateRequestProgrammingLanguage) {
		programmingLanguageService.update(updateRequestProgrammingLanguage);
	}

	

}
