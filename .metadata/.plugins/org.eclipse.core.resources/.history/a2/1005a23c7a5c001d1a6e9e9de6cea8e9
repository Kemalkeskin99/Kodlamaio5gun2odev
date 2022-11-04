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
@Table(name="ProgramingLanguage")


public class ProgramingLanguages {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="programingLanguage_Id")
	private int id;
	
	@Column(name="language_Name")
	private String languageName;

	public ProgramingLanguages() {
		
	}

	public ProgramingLanguages(int id, String languageName) {
		this.id = id;
		this.languageName = languageName;
	
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
