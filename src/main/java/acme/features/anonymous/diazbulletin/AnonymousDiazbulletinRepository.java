
package acme.features.anonymous.diazbulletin;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.diazbulletin.Diazbulletin;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousDiazbulletinRepository extends AbstractRepository {

	@Query("select b from Diazbulletin b")
	Collection<Diazbulletin> findMany();

}
