
package acme.features.anonymous.rubiobulletin;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.rubiobulletins.Rubiobulletin;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousRubiobulletinRepository extends AbstractRepository {

	@Query("select s from Rubiobulletin s")
	Collection<Rubiobulletin> findMany();

}
