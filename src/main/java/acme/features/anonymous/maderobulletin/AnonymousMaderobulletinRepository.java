
package acme.features.anonymous.maderobulletin;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.maderobulletins.Maderobulletin;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousMaderobulletinRepository extends AbstractRepository {

	@Query("select s from Maderobulletin s")
	Collection<Maderobulletin> findMany();

}
