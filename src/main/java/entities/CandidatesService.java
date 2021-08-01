package entities;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

public class CandidatesService {
	
	@Autowired
	private CandidatesRepository candidatesRepository;
	
	public Optional<Candidates> findById(Long id) {
		if(id != null) {
			return candidatesRepository.findById(id);
				
		}
		return null;
	}

}
