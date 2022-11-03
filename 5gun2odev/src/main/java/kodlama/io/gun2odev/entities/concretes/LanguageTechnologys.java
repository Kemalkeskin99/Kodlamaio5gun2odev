package kodlama.io.gun2odev.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	@Column(name="language_Name")
	private String languageName;

	public LanguageTechnologys() {
	
	}

	public LanguageTechnologys(int technology_Id, String technology_Name, String languageName) {
		this.technology_Id = technology_Id;
		this.technology_Name = technology_Name;
		this.languageName = languageName;
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

	public String getLanguageName() {
		return languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	
	
	
	
	
	

}
