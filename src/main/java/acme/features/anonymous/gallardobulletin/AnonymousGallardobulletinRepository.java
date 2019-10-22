
package acme.features.anonymous.gallardobulletin;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.gallardobulletins.Gallardobulletin;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousGallardobulletinRepository extends AbstractRepository {

	@Query("select s from Gallardobulletin s")
	Collection<Gallardobulletin> findMany();

}
