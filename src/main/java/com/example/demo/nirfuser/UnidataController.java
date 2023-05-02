package com.example.demo.nirfuser;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class UnidataController {
	
	@Autowired
	private UnidataRepository unidataRepo;
	
	@PostMapping("/getunis")
	public List<Unidata> getUnis(@Valid @RequestBody Getunidata newunis) 
	{
		List<Unidata> unis = unidataRepo.findByEmail(newunis.getEmail());
		return unis;
	}
	
	@PostMapping("/postunis")
	public Unidata updateUnis(@Valid @RequestBody Unidata newunis)
	{ 
    		return unidataRepo.save(newunis);
    }
	
	@PutMapping("/putunis/{id}")
	public Unidata putUnis(@Valid @RequestBody Editunidata payload, @PathVariable String id)
	{
		Unidata unisindb = unidataRepo.findById(id).get();
		unisindb.setPayload(payload.getPayload());
		unisindb.setUpdationinfo(payload.getUpdationinfo());
		unisindb.setUniname(payload.getUniname());
		return unidataRepo.save(unisindb);
    }
	
	@DeleteMapping("/deleteuni/{id}")
	public void deleteunibyid(@PathVariable String id)
	{
		unidataRepo.deleteById(id);
	}
	
	@DeleteMapping("/deleteallunis/{email}")
	public void deleteallunisbyemail(@PathVariable String email)
	{
		unidataRepo.deleteAllByEmail(email);
	}
}
