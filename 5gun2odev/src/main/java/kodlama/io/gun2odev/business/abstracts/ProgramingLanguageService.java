package kodlama.io.gun2odev.business.abstracts;

import java.util.List;

import kodlama.io.gun2odev.business.requests.CreateProgramingLanguageRequest;
import kodlama.io.gun2odev.business.requests.UpdateProgramingLanguageRequest;
import kodlama.io.gun2odev.business.responses.GetAllProgramingLanguageResponse;

public interface ProgramingLanguageService {
	
	List<GetAllProgramingLanguageResponse>getAll();
	void add(CreateProgramingLanguageRequest createProgramingLanguageRequest);
	void delete(int id);
	void update(UpdateProgramingLanguageRequest updateProgramingLanguageRequest, int id);


}
