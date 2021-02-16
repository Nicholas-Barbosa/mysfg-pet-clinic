package guru.springframework.sfgpetclinic.services.map;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.services.OwnerService;

class OwnerMapServiceTest {

	OwnerService ownerService;

	@BeforeEach
	void setUp() throws Exception {
		ownerService = new OwnerMapService(new PetTypeMapService(), new PetMapService());

		ownerService.save(new Owner("Charlotenburg", "Berlin", "72838"));
	}

	@Test
	void findAll() {
		assertEquals(1, ownerService.findAll().size());
	}

}
