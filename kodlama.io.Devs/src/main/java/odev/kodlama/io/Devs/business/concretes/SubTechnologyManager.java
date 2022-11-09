package odev.kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import odev.kodlama.io.Devs.business.abstracts.SubTechnologyService;
import odev.kodlama.io.Devs.business.request.subTechnologyRequest.AddRequestSubTechnology;
import odev.kodlama.io.Devs.business.request.subTechnologyRequest.DeleteRequestSubTechnology;
import odev.kodlama.io.Devs.business.request.subTechnologyRequest.UpdateRequestSubTechnology;
import odev.kodlama.io.Devs.business.response.programmingResponse.GetAllReponseProgrammingLanguage;
import odev.kodlama.io.Devs.business.response.programmingResponse.GetByIdReponseProgrammingLanguage;
import odev.kodlama.io.Devs.business.response.subTechnologyResponse.GetAllResponseSubTechnology;
import odev.kodlama.io.Devs.business.response.subTechnologyResponse.GetByIdResponseSubTechnology;
import odev.kodlama.io.Devs.dataAccess.abstracts.SubTechnologyRepository;
import odev.kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import odev.kodlama.io.Devs.entities.concretes.SubTechnology;
@Service
public class SubTechnologyManager implements SubTechnologyService {
	private SubTechnologyRepository subTechnologyRepository;
	@Autowired
	public SubTechnologyManager(SubTechnologyRepository subTechnologyRepository) {
		this.subTechnologyRepository=subTechnologyRepository;
	}
	

	@Override
	public void add(AddRequestSubTechnology addRequestSubTechnology) {
		SubTechnology subTechnology=new SubTechnology();
		subTechnology.setName(addRequestSubTechnology.getName());
		this.subTechnologyRepository.save(subTechnology);
	}

	@Override
	public List<GetAllResponseSubTechnology> getAll() {
		List<SubTechnology> subTechnologies=subTechnologyRepository.findAll();
		List<GetAllResponseSubTechnology> getAllReponseProgrammingLanguages=new ArrayList<GetAllResponseSubTechnology>();
		for (SubTechnology subTechnology : subTechnologies) {
			GetAllResponseSubTechnology responseItem=new GetAllResponseSubTechnology();
			responseItem.setId(subTechnology.getId());
			responseItem.setName(subTechnology.getName());
			getAllReponseProgrammingLanguages.add(responseItem);
		}
		return getAllReponseProgrammingLanguages;
	}


	@Override
	public GetByIdResponseSubTechnology getById(int id) {
		Optional<SubTechnology> subTechnologies=subTechnologyRepository.findById(id);
		GetByIdResponseSubTechnology getbyIdItem=new GetByIdResponseSubTechnology();
		getbyIdItem.setName(subTechnologies.get().getName());
		return getbyIdItem;
	}


	@Override
	public void delete(DeleteRequestSubTechnology deleteRequestProgrammingLanguage) {
	
		SubTechnology subTechnology = subTechnologyRepository.findById(deleteRequestProgrammingLanguage.getId()).get();
		subTechnologyRepository.delete(subTechnology);
	
		
	}


	@Override
	public void update(UpdateRequestSubTechnology updateRequestSubTechnology) {
		SubTechnology subTechnology = subTechnologyRepository.findById(updateRequestSubTechnology.getId()).get();
		subTechnology.setId(updateRequestSubTechnology.getId());
		subTechnology.setName(updateRequestSubTechnology.getName());
		subTechnologyRepository.save(subTechnology);
		
	}

}
