package guru.springframework.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;

public class Owner extends Person {

	private String address;
	private String city;
	private String telephone;
	private Set<Pet> pets = new HashSet<>();

	public Owner() {
		// TODO Auto-generated constructor stub
	}

	public Owner(String address, String city, String telephone) {
		super();
		this.address = address;
		this.city = city;
		this.telephone = telephone;
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
