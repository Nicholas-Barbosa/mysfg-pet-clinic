package guru.springframework.sfgpetclinic.model;

import java.util.Set;

public class Owner extends Person {

	private Set<Pet>pets;

	public Set<Pet> getPets() {
		return pets;
	}
	
	
}
