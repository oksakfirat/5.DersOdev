package odev.kodlama.io.Devs.business.abstracts;

import java.util.List;

import odev.kodlama.io.Devs.business.request.programmingRequest.AddRequestProgrammingLanguage;
import odev.kodlama.io.Devs.business.request.programmingRequest.DeleteRequestProgrammingLanguage;
import odev.kodlama.io.Devs.business.request.programmingRequest.UpdateRequestProgrammingLanguage;
import odev.kodlama.io.Devs.business.response.programmingResponse.GetAllReponseProgrammingLanguage;
import odev.kodlama.io.Devs.business.response.programmingResponse.GetByIdReponseProgrammingLanguage;

public interface ProgrammingLanguageService {
	List<GetAllReponseProgrammingLanguage> getAll();
	GetByIdReponseProgrammingLanguage getById(int id);
	public void add(AddRequestProgrammingLanguage addRequestProgrammingLanguage);
	public void delete(DeleteRequestProgrammingLanguage deleteRequestProgrammingLanguage);
	public void update(UpdateRequestProgrammingLanguage updateRequestProgrammingLanguage);

}
