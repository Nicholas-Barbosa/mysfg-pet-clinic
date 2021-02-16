package guru.springframework.sfgpetclinic.services.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.services.OwnerService;

class OwnerMapServiceTest {

	OwnerService ownerService;

	final long id = 1;

	@BeforeEach
	void setUp() throws Exception {
		ownerService = new OwnerMapService(new PetTypeMapService(), new PetMapService());

		ownerService.save(new Owner(id, "Charlotenburg", "Berlin", "72838", "Barbosa"));
	}

	@Test
	void findAll() {
		assertEquals(1, ownerService.findAll().size());
	}

	@Test
	void findById() {
		assertEquals(1, ownerService.findById(id).getId());
	}

	@Test
	void save() {
		Owner owner2 = ownerService.save(new Owner(2l, "Mall", "Berlin", "12333", "Pastri"));
		assertNotNull(owner2);
	}

	@Test
	void delete() {
		ownerService.delete(ownerService.findById(id));
		assertEquals(0, ownerService.findAll().size());
	}

	@Test
	void deleteById() {
		ownerService.deleteById(id);
		assertEquals(0, ownerService.findAll().size());
	}

	@Test
	void findByLastName() {
		Owner owner = ownerService.findByLastName("Barbosa");
		assertNotNull(owner);
	}
}
