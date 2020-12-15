package guru.springframework.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;

public class Vet extends Person {

	private Set<Speciality> specialities = new HashSet<>();

	public Vet() {
		// TODO Auto-generated constructor stub
	}

	public Vet(Set<Speciality> specialities) {
		super();
		this.specialities = specialities;
	}

	public Set<Speciality> getSpecialities() {
		return specialities;
	}

}
