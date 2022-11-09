package odev.kodlama.io.Devs.business.abstracts;

import java.util.List;

import odev.kodlama.io.Devs.business.request.subTechnologyRequest.AddRequestSubTechnology;
import odev.kodlama.io.Devs.business.request.subTechnologyRequest.DeleteRequestSubTechnology;
import odev.kodlama.io.Devs.business.request.subTechnologyRequest.UpdateRequestSubTechnology;
import odev.kodlama.io.Devs.business.response.subTechnologyResponse.GetAllResponseSubTechnology;
import odev.kodlama.io.Devs.business.response.subTechnologyResponse.GetByIdResponseSubTechnology;


public interface SubTechnologyService {
	List<GetAllResponseSubTechnology> getAll();
	public void add(AddRequestSubTechnology addRequestSubTechnology);
	GetByIdResponseSubTechnology getById(int id);
	public void delete(DeleteRequestSubTechnology deleteRequestSubTechnology);
	public void update(UpdateRequestSubTechnology updateRequestSubTechnology);
	
}
