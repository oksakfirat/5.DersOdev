package odev.kodlama.io.Devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import odev.kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Integer>{

//	List<ProgrammingLanguage> getAll();
//	ProgrammingLanguage byId(int id);
//	public void add(ProgrammingLanguage programmingLanguage);
//	public void delete(int id);
//	public void update(int id,ProgrammingLanguage programmingLanguage);
	
	
}
