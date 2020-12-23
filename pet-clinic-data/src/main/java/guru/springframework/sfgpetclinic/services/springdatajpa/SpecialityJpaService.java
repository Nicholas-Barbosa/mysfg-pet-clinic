package guru.springframework.sfgpetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinic.model.Specialty;
import guru.springframework.sfgpetclinic.repositories.SpecialtyRepository;
import guru.springframework.sfgpetclinic.services.SpecialityService;

@Service
@Profile("springdatajpa")
public class SpecialityJpaService implements SpecialityService {

	private final SpecialtyRepository specialtyRepository;

	public SpecialityJpaService(SpecialtyRepository specialtyRepository) {
		super();
		this.specialtyRepository = specialtyRepository;
	}

	@Override
	public Set<Specialty> findAll() {
		Set<Specialty> specialties = new HashSet<>();
		specialtyRepository.findAll().forEach(specialties::add);
		return specialties;
	}

	@Override
	public Specialty findById(Long id) {
		// TODO Auto-generated method stub
		return specialtyRepository.findById(id).orElse(null);
	}

	@Override
	public Specialty save(Specialty object) {
		// TODO Auto-generated method stub
		return specialtyRepository.save(object);
	}

	@Override
	public void delete(Specialty object) {
		specialtyRepository.delete(object);

	}

	@Override
	public void deleteById(Long id) {
		specialtyRepository.deleteById(id);

	}

}
