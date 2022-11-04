package kodlama.io.gun2odev.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	
	@OneToMany(mappedBy = "programingLanguages")
	private List< LanguageTechnologys> languageTechnologys;

	public ProgramingLanguages() {
		
	}

	public ProgramingLanguages(int id, String languageName, List<LanguageTechnologys> languageTechnologys) {
		this.id = id;
		this.languageName = languageName;
		this.languageTechnologys = languageTechnologys;
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

	public List<LanguageTechnologys> getLanguageTechnologys() {
		return languageTechnologys;
	}

	public void setLanguageTechnologys(List<LanguageTechnologys> languageTechnologys) {
		this.languageTechnologys = languageTechnologys;
	}

	

	
	
	
	
	
	

}
