package kodlama.io.gun2odev.business.responses;

public class GetAllProgramingLanguageResponse {

	private int id;
	private String languageName;

	
	public GetAllProgramingLanguageResponse() {
		
	}

	public GetAllProgramingLanguageResponse(int id, String languageName) {
		this.id = id;
		this.languageName = languageName;
	//	this.technology_Name = technology_Name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLanguageName() {
		return languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}



}
