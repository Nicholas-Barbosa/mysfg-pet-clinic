package guru.springframework.sfgpetclinic.model;

public class Person extends BaseEntity{

	
	private String firstName;
	private String secondName;

	public String getFirstName() {
		return firstName;
	}

	public String getSecondName() {
		return secondName;
	}

}
