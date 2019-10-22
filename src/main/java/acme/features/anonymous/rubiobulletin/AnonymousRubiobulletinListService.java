
package acme.features.anonymous.rubiobulletin;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.rubiobulletins.Rubiobulletin;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousRubiobulletinListService implements AbstractListService<Anonymous, Rubiobulletin> {

	// Internal state ----------------------------------------------------------

	@Autowired
	AnonymousRubiobulletinRepository repository;


	// AbstractListService<Anonymous, Shout> interface --------------------

	@Override
	public boolean authorise(final Request<Rubiobulletin> request) {
		assert request != null;

		return true;
	}

	@Override
	public Collection<Rubiobulletin> findMany(final Request<Rubiobulletin> request) {
		assert request != null;

		Collection<Rubiobulletin> result;

		result = this.repository.findMany();

		return result;
	}

	@Override
	public void unbind(final Request<Rubiobulletin> request, final Rubiobulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "author", "link");
	}

}
