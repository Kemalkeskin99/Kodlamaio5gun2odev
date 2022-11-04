package kodlama.io.gun2odev.business.responses;



public class GetAllLanguageTechnologyResponse {

	private int technology_Id;
	private String technology_Name;
	private int id;
	
	public GetAllLanguageTechnologyResponse() {
		
	}
	
	public GetAllLanguageTechnologyResponse(int technology_Id, String technology_Name, int id) {
		this.technology_Id = technology_Id;
		this.technology_Name = technology_Name;
		this.id = id;
	}
	
	
	public int getTechnology_Id() {
		return technology_Id;
	}
	public void setTechnology_Id(int technology_Id) {
		this.technology_Id = technology_Id;
	}
	public String getTechnology_Name() {
		return technology_Name;
	}
	public void setTechnology_Name(String technology_Name) {
		this.technology_Name = technology_Name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	
	

	
	
	

}
