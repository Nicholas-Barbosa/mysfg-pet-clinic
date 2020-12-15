package guru.springframework.sfgpetclinic.model;

public class PetType extends BaseEntity{

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
