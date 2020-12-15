package guru.springframework.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.PetService;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import guru.springframework.sfgpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petService;

	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petService = petService;
	}

	@Override
	public void run(String... args) throws Exception {

		PetType dog = new PetType("Chopp");
		petService.save(dog);

		PetType papagaio = new PetType("Parafina");
		petService.save(papagaio);

		PetType camaleao = new PetType("Camaleao");
		petService.save(camaleao);
		
		System.out.println("Loaded Pets...");

		Owner owner1 = new Owner();
		owner1.setFirstName("Nicholas");
		owner1.setSecondName("Barbosa");

		ownerService.save(owner1);

		Owner owner2 = new Owner();
		owner2.setFirstName("Katia");
		owner2.setSecondName("Barbosa");

		ownerService.save(owner2);

		System.out.println("Loaded Owners...");

		Vet vet1 = new Vet();
		vet1.setFirstName("Sam");
		vet1.setSecondName("Axe");

		vetService.save(vet1);

		Vet vet2 = new Vet();
		vet2.setFirstName("Paolo");
		vet2.setSecondName("Rossi");

		vetService.save(vet2);
		System.out.println("Loaded Vets...");
	}

}
