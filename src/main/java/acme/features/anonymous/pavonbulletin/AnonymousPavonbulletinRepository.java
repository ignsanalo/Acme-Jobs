
package acme.features.anonymous.pavonbulletin;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.pavonbulletins.Pavonbulletin;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousPavonbulletinRepository extends AbstractRepository {

	@Query("select s from Pavonbulletin s")
	Collection<Pavonbulletin> findMany();

}
