package guru.springframework.sfgpetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "especialities")
public class Speciality extends BaseEntity {

	@Column(name = "description")
	private String description;

	public Speciality(String description) {
		super();
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

}
