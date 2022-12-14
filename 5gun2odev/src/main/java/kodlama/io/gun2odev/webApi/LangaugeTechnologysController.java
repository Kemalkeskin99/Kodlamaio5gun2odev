package kodlama.io.gun2odev.webApi;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import kodlama.io.gun2odev.business.abstracts.LanguageTechnologyService;
import kodlama.io.gun2odev.business.requests.CreateLanguageTechnologyRequest;
import kodlama.io.gun2odev.business.requests.UpdateLanguageTechnologyRequest;
import kodlama.io.gun2odev.business.responses.GetAllLanguageTechnologyResponse;

@RestController
@RequestMapping("/api/languagetechnologys")
public class LangaugeTechnologysController {
	
	private LanguageTechnologyService languageTechnologyService;

	public LangaugeTechnologysController(LanguageTechnologyService languageTechnologyService) {
		this.languageTechnologyService = languageTechnologyService;
	}
	
	@GetMapping("/getall")
	public List<GetAllLanguageTechnologyResponse> getAll(){
		return languageTechnologyService.getAll();
	}
	@PostMapping("/add")
	void add(@RequestBody CreateLanguageTechnologyRequest createLanguageTechnologyRequest) {
		this.languageTechnologyService.add(createLanguageTechnologyRequest);
	}
	@PostMapping("/delete")
	void delete(int id) {
		this.languageTechnologyService.delete(id);
	}
	@PostMapping("/update")
	void update(int id, UpdateLanguageTechnologyRequest updateLanguageTechnologyRequest) {
		this.languageTechnologyService.update(id, updateLanguageTechnologyRequest);
	}
	}
	


