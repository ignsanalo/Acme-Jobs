
package acme.features.anonymous.gallardobulletin;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.gallardobulletins.Gallardobulletin;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousGallardobulletinListService implements AbstractListService<Anonymous, Gallardobulletin> {

	// Internal state ----------------------------------------------------------

	@Autowired
	AnonymousGallardobulletinRepository repository;


	// AbstractListService<Anonymous, Gallardobulletin> interface --------------------

	@Override
	public boolean authorise(final Request<Gallardobulletin> request) {
		assert request != null;

		return true;
	}

	@Override
	public Collection<Gallardobulletin> findMany(final Request<Gallardobulletin> request) {
		assert request != null;

		Collection<Gallardobulletin> result;

		result = this.repository.findMany();

		return result;
	}

	@Override
	public void unbind(final Request<Gallardobulletin> request, final Gallardobulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "author", "songAuthor");
	}

}
