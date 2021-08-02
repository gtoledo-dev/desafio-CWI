package entities;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatesRepository extends JpaRepository<Candidates, Long>{
	
	List<Candidates> findByNameOrId(String name, Long id);
	
	Candidates findByEmailAndPassword(String email, String password);

}
