package guru.springframework.sfgpetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "types")
public class PetType extends BaseEntity {

	@Column(name = "name")
	private String name;

	public PetType() {
		// TODO Auto-generated constructor stub
	}

	public PetType(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
