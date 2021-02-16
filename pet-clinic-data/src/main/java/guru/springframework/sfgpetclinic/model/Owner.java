package guru.springframework.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "owners")
public class Owner extends Person {

	@Column(name = "address")
	private String address;

	@Column(name = "city")
	private String city;

	@Column(name = "telephone")
	private String telephone;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
	private Set<Pet> pets = new HashSet<>();

	public Owner() {
		// TODO Auto-generated constructor stub
	}

	public Owner(Long id, String address, String city, String telephone,String lastName) {
		super();
		ownerId(id);
		ownerLastName(lastName);
		this.address = address;
		this.city = city;
		this.telephone = telephone;

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

	public final void ownerId(Long id) {
		super.setId(id);
	}
	public final void ownerLastName(String name) {
		super.setSecondName(name);
	}
}
