package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

public class Pet extends BaseEntity {

	private String name;
	private PetType petType;
	private Owner owner;
	private LocalDate birthDate;

	public Pet() {
		// TODO Auto-generated constructor stub
	}

	public Pet(String name, PetType petType, Owner owner, LocalDate birthDate) {
		super();
		this.name = name;
		this.petType = petType;
		this.owner = owner;
		this.birthDate = birthDate;
	}

	public PetType getPetType() {
		return petType;
	}

	public void setPetType(PetType petType) {
		this.petType = petType;
	}

	public Owner getOwner() {
		return owner;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public String getName() {
		return name;
	}
}
