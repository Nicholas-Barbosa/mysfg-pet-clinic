package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

public class Visit extends BaseEntity {

	private LocalDate date;
	private String description;
	private Pet pet;

	public Visit(LocalDate date, String description, Pet pet) {
		super();
		this.date = date;
		this.description = description;
		this.pet = pet;
	}

	public LocalDate getDate() {
		return date;
	}

	public String getDescription() {
		return description;
	}

	public Pet getPet() {
		return pet;
	}

}
