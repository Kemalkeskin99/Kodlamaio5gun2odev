package kodlama.io.gun2odev.business.requests;

public class CreateProgramingLanguageRequest {
	
	private String languageName;

	
	
	public CreateProgramingLanguageRequest() {
		
	}
	
	
	public CreateProgramingLanguageRequest(String languageName) {
		this.languageName = languageName;

	}
	
	
	public String getLanguageName() {
		return languageName;
	}
	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}
	
	
	
	

}
