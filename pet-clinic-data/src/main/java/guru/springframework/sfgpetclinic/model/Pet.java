package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pets")
public class Pet extends BaseEntity {

	@Column(name="name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name="type_id")
	private PetType petType;
	
	@ManyToOne
	@JoinColumn(name="onwer_id")
	private Owner owner;
	
	@Column(name="birth_date")
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
