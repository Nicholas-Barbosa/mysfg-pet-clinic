package guru.springframework.sfgpetclinic.services;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.Pet;

public interface VetService {

	
	VetService findById(Long id);
	
	VetService save();
	
	Set<VetService> findAll(Long id);
}
