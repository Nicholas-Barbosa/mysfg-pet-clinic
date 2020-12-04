package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

public class Pet {

	private PetType petType;
	private Owner owner;
	private LocalDate birthDate;

	public PetType getPetType() {
		return petType;
	}

	public Owner getOwner() {
		return owner;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

}
