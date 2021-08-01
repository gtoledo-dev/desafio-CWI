package entities;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatesRepository extends JpaRepository<Candidates, Long>{
	
	List<Candidates> findByNameOrCpf(String name, Long cpf);
	
	Candidates findEmailAnd(String email, String password);

}
