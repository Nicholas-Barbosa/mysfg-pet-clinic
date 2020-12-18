package guru.springframework.sfgpetclinic.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/*
 * Hey JPA, iremos herdas as propriedades dessa classe. Ela nao sera mapeada como uma entidade na database, mas sera de base para as outras mapeadas.
 */
@MappedSuperclass
public class BaseEntity {

	/*
	 * Sera mapeado a covariantes desta classe.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
