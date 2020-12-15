package guru.springframework.sfgpetclinic.model;

import java.util.Set;

public class Owner extends Person {

	private String address;
	private String city;
	private String telephone;
	private Set<Pet> pets;

	public Owner() {
		// TODO Auto-generated constructor stub
	}

	public Owner(String address, String city, String telephone, Set<Pet> pets) {
		super();
		this.address = address;
		this.city = city;
		this.telephone = telephone;
		this.pets = pets;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getTelephone() {
		return telephone;
	}

	public Set<Pet> getPets() {
		return pets;
	}

}
