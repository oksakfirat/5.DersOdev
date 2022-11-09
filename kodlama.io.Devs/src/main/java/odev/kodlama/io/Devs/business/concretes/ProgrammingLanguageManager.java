package odev.kodlama.io.Devs.business.concretes;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import odev.kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import odev.kodlama.io.Devs.business.request.programmingRequest.AddRequestProgrammingLanguage;
import odev.kodlama.io.Devs.business.request.programmingRequest.DeleteRequestProgrammingLanguage;
import odev.kodlama.io.Devs.business.request.programmingRequest.UpdateRequestProgrammingLanguage;
import odev.kodlama.io.Devs.business.response.programmingResponse.GetAllReponseProgrammingLanguage;
import odev.kodlama.io.Devs.business.response.programmingResponse.GetByIdReponseProgrammingLanguage;
import odev.kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import odev.kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
	private ProgrammingLanguageRepository programmingLanguageRepository;
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageRepository=programmingLanguageRepository;
	}

	@Override
	public List<GetAllReponseProgrammingLanguage> getAll() {
		List<ProgrammingLanguage> programmingLanguages=programmingLanguageRepository.findAll();
		List<GetAllReponseProgrammingLanguage> getAllReponseProgrammingLanguages=new ArrayList<GetAllReponseProgrammingLanguage>();
		for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
			GetAllReponseProgrammingLanguage responseItem=new GetAllReponseProgrammingLanguage();
			responseItem.setId(programmingLanguage.getId());
			responseItem.setName(programmingLanguage.getName());
			getAllReponseProgrammingLanguages.add(responseItem);
		}
		return getAllReponseProgrammingLanguages;
	}
	
	@Override
	public GetByIdReponseProgrammingLanguage getById(int id) {
		Optional<ProgrammingLanguage> programmingLanguages=programmingLanguageRepository.findById(id);
		GetByIdReponseProgrammingLanguage getbyIdItem=new GetByIdReponseProgrammingLanguage();
		getbyIdItem.setName(programmingLanguages.get().getName());
		
		return getbyIdItem;
	}

	@Override
	public void add(AddRequestProgrammingLanguage addRequestProgrammingLanguage) {
		ProgrammingLanguage programmingLanguage=new ProgrammingLanguage();
		programmingLanguage.setName(addRequestProgrammingLanguage.getName());
		this.programmingLanguageRepository.save(programmingLanguage);
		
	}

	@Override
	public void delete(DeleteRequestProgrammingLanguage deleteRequestProgrammingLanguage) {
		ProgrammingLanguage programmingLanguage = programmingLanguageRepository.findById(deleteRequestProgrammingLanguage.getId()).get();
		programmingLanguageRepository.delete(programmingLanguage);
		
	}

	@Override
	public void update(UpdateRequestProgrammingLanguage updateRequestProgrammingLanguage) {
		ProgrammingLanguage programmingLanguage = programmingLanguageRepository.findById(updateRequestProgrammingLanguage.getId()).get();
		programmingLanguage.setId(updateRequestProgrammingLanguage.getId());
		programmingLanguage.setName(updateRequestProgrammingLanguage.getName());
		programmingLanguageRepository.save(programmingLanguage);
	}



	

	
	

}
