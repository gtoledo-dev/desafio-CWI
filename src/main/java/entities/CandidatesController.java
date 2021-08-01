package entities;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/candidates")
public class CandidatesController {
	
	@Autowired
	private CandidatesService service;
	
	@GetMapping("/get")
	public ResponseEntity<Candidates> getCandidates(
			@RequestParam(required = false) String name,
			@RequestHeader("autorization") String autorization){
		return ResponseEntity
				.ok(service.findById(id)).build();
	}
	
	@PostMapping("/save")
	public ResponseEntity<Candidates> postCandidates(
			@RequestBody Candidates candidates){
		return ResponseEntity.status(HttpStatus
				.CREATED).build();
	}
	
	@PutMapping("/save/{id}/")
	public ResponseEntity<Candidates> putCandidates(
			@PathParam("id") Long id, 
			@RequestBody Candidates candidates){
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping("/delete/{id}/")
	public ResponseEntity<Candidates> deleteCandidates(
			@PathParam("id") Long id){
		return ResponseEntity.ok().build();
	}
		
	}

}
