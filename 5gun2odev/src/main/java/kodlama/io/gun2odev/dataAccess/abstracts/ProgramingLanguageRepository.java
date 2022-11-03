package kodlama.io.gun2odev.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.gun2odev.entities.concretes.ProgramingLanguages;

public interface ProgramingLanguageRepository extends JpaRepository<ProgramingLanguages, Integer> {

}
