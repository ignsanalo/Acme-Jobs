
package acme.features.anonymous.maderobulletin;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.maderobulletins.Maderobulletin;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousMaderobulletinListService implements AbstractListService<Anonymous, Maderobulletin> {

	// Internal state ----------------------------------------------------------

	@Autowired
	AnonymousMaderobulletinRepository repository;


	// AbstractListService<Anonymous, Shout> interface --------------------

	@Override
	public boolean authorise(final Request<Maderobulletin> request) {
		assert request != null;

		return true;
	}

	@Override
	public Collection<Maderobulletin> findMany(final Request<Maderobulletin> request) {
		assert request != null;

		Collection<Maderobulletin> result;

		result = this.repository.findMany();

		return result;
	}

	@Override
	public void unbind(final Request<Maderobulletin> request, final Maderobulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "author", "photo");
	}

}
