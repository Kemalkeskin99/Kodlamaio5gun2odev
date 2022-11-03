package kodlama.io.gun2odev.business.requests;



public class UpdateLanguageTechnologyRequest {
	

	private String technology_Name;
	private String languageName;
	
	public UpdateLanguageTechnologyRequest() {

	}

	public UpdateLanguageTechnologyRequest(String technology_Name, String languageName) {
		this.technology_Name = technology_Name;
		this.languageName = languageName;
	}

	public String getTechnology_Name() {
		return technology_Name;
	}

	public void setTechnology_Name(String technology_Name) {
		this.technology_Name = technology_Name;
	}

	public String getLanguageName() {
		return languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}
	
	
	
	

}
