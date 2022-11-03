package kodlama.io.gun2odev.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


import kodlama.io.gun2odev.business.abstracts.LanguageTechnologyService;
import kodlama.io.gun2odev.business.requests.CreateLanguageTechnologyRequest;
import kodlama.io.gun2odev.business.requests.UpdateLanguageTechnologyRequest;
import kodlama.io.gun2odev.business.responses.GetAllLanguageTechnologyResponse;
import kodlama.io.gun2odev.dataAccess.abstracts.LanguageTecnhologyRepository;
import kodlama.io.gun2odev.entities.concretes.LanguageTechnologys;
@Service
public class LanguageTechnologyManager implements LanguageTechnologyService{
	
	private LanguageTecnhologyRepository languageTecnhologyRepository;
	

	public LanguageTechnologyManager(LanguageTecnhologyRepository languageTecnhologyRepository) {
		this.languageTecnhologyRepository = languageTecnhologyRepository;
	}

	@Override
	public List<GetAllLanguageTechnologyResponse> getAll() {
		 List<LanguageTechnologys>languageTechnologies=languageTecnhologyRepository.findAll();
		 List<GetAllLanguageTechnologyResponse>getAllLanguageTechnologyResponses=new ArrayList<GetAllLanguageTechnologyResponse>();
		 for (LanguageTechnologys languageTechnology : languageTechnologies) {
			 	GetAllLanguageTechnologyResponse allLanguageTechnologyResponse=new GetAllLanguageTechnologyResponse();
			 	allLanguageTechnologyResponse.setTechnology_Id(languageTechnology.getTechnology_Id());
			 	allLanguageTechnologyResponse.setTechnology_Name(languageTechnology.getTechnology_Name());
			 	allLanguageTechnologyResponse.setLanguageName(languageTechnology.getLanguageName());
			 	getAllLanguageTechnologyResponses.add(allLanguageTechnologyResponse);
		}
		
		return getAllLanguageTechnologyResponses;
	}

	@Override
	public void add(CreateLanguageTechnologyRequest createLanguageTechnologyRequest) {
		LanguageTechnologys languageTechnologys=new LanguageTechnologys();
		languageTechnologys.setLanguageName(createLanguageTechnologyRequest.getLanguageName());
		languageTechnologys.setTechnology_Name(createLanguageTechnologyRequest.getTechnology_Name());
		this.languageTecnhologyRepository.save(languageTechnologys);
		
		
	}

	@Override
	public void delete(int id) {
		
		languageTecnhologyRepository.deleteById(id);
	}

	@Override
	public void update(int id,UpdateLanguageTechnologyRequest updateLanguageTechnologyRequest) {
		LanguageTechnologys languageTechnologys=languageTecnhologyRepository.findById(id).get();
		languageTechnologys.setLanguageName(updateLanguageTechnologyRequest.getLanguageName());
		languageTechnologys.setTechnology_Name(updateLanguageTechnologyRequest.getTechnology_Name());
		this.languageTecnhologyRepository.save(languageTechnologys);
		
	}





}
