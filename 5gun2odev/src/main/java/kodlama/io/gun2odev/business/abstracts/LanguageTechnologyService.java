package kodlama.io.gun2odev.business.abstracts;

import java.util.List;

import kodlama.io.gun2odev.business.requests.CreateLanguageTechnologyRequest;
import kodlama.io.gun2odev.business.requests.UpdateLanguageTechnologyRequest;
import kodlama.io.gun2odev.business.responses.GetAllLanguageTechnologyResponse;

public interface LanguageTechnologyService {
	
	List<GetAllLanguageTechnologyResponse>getAll();
	void add(CreateLanguageTechnologyRequest createLanguageTechnologyRequest);
	void delete(int id);
	void update(int id, UpdateLanguageTechnologyRequest updateLanguageTechnologyRequest);

}
