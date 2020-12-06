package guru.springframework.sfgpetclinic.services;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.Vet;

public interface VetService {

	
	Vet findById(Long id);
	
	Vet save();
	
	Set<Vet> findAll(Long id);
}
