package kodlama.io.gun2odev.webApi;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.gun2odev.business.abstracts.ProgramingLanguageService;
import kodlama.io.gun2odev.business.requests.CreateProgramingLanguageRequest;
import kodlama.io.gun2odev.business.requests.UpdateProgramingLanguageRequest;
import kodlama.io.gun2odev.business.responses.GetAllProgramingLanguageResponse;

@RestController
@RequestMapping("/api/programinglanguages")
public class ProgramingLanguagesController {
	
	private ProgramingLanguageService programingLanguageService;

	public ProgramingLanguagesController(ProgramingLanguageService programingLanguageService) {
		this.programingLanguageService = programingLanguageService;
	}
	
	@GetMapping("/getall")
	public List<GetAllProgramingLanguageResponse> getAll(){
		return programingLanguageService.getAll();
		
	}
	@PostMapping("/add")
	public void add(@RequestBody CreateProgramingLanguageRequest createProgramingLanguageRequest) {
		this.programingLanguageService.add(createProgramingLanguageRequest);
	}
	@PostMapping("/delete")
	public void delete(int id) {
		this.programingLanguageService.delete(id);
	}
	@PostMapping("/update")
	public void update(@RequestBody UpdateProgramingLanguageRequest updateProgramingLanguageRequest, int id) {
		this.programingLanguageService.update(updateProgramingLanguageRequest,id);
	}

}
