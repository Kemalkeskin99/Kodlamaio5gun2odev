package kodlama.io.gun2odev.entities.concretes;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="LanguageTechnology")


public class LanguageTechnologys {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="technology_Id")
	private int technology_Id;
	
	@Column(name="technology_Name")
	private String technology_Name;
	
	@ManyToOne
	@JoinColumn(name = "id")
	private ProgramingLanguages programingLanguages;

	public LanguageTechnologys() {
	
	}
	

	public LanguageTechnologys(int technology_Id, String technology_Name,ProgramingLanguages programingLanguages) {
	
		this.technology_Id = technology_Id;
		this.technology_Name = technology_Name;
		this.programingLanguages = programingLanguages;
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


	public ProgramingLanguages getProgramingLanguages() {
		return programingLanguages;
	}


	public void setProgramingLanguages(ProgramingLanguages programingLanguages) {
		this.programingLanguages = programingLanguages;
	}



	
	
	
	
	
	

}
