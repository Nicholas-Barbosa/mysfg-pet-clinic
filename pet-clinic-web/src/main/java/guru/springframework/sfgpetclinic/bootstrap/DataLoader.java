package guru.springframework.sfgpetclinic.bootstrap;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
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

		PetType dog = new PetType("Dog");
		petService.save(dog);

		PetType papagaio = new PetType("Papagaio");
		petService.save(papagaio);

		PetType camaleao = new PetType("Camaleao");
		petService.save(camaleao);

		System.out.println("Loaded Pets...");

		Owner owner1 = new Owner("123 Brickerel", "Honolulu", "9292");
		owner1.setFirstName("Nicholas");
		owner1.setSecondName("Barbosa");

		Pet choppPet = new Pet("Chopp", dog, owner1, LocalDate.of(2016, Month.OCTOBER, 10));
		owner1.getPets().add(choppPet);
		ownerService.save(owner1);

		Owner owner2 = new Owner("321 Charlotenburg", "Berlin", "2991");
		owner2.setFirstName("Katia");
		owner2.setSecondName("Barbosa");

		Pet parPet = new Pet("Parafina", papagaio, owner2, LocalDate.of(2016, Month.OCTOBER, 10));
		owner2.getPets().add(parPet);
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
