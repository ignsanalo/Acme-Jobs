
package acme.features.anonymous.sanabriabulletin;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.sanabriabulletins.Sanabriabulletin;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousSanabriabulletinRepository extends AbstractRepository {

	@Query("select s from Sanabriabulletin s")
	Collection<Sanabriabulletin> findMany();

}
