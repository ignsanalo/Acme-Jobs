
package acme.features.anonymous.sanabriabulletin;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.sanabriabulletins.Sanabriabulletin;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousSanabriabulletinListService implements AbstractListService<Anonymous, Sanabriabulletin> {

	// Internal state ----------------------------------------------------------

	@Autowired
	AnonymousSanabriabulletinRepository repository;


	// AbstractListService<Anonymous, Shout> interface --------------------

	@Override
	public boolean authorise(final Request<Sanabriabulletin> request) {
		assert request != null;

		return true;
	}

	@Override
	public Collection<Sanabriabulletin> findMany(final Request<Sanabriabulletin> request) {
		assert request != null;

		Collection<Sanabriabulletin> result;

		result = this.repository.findMany();

		return result;
	}

	@Override
	public void unbind(final Request<Sanabriabulletin> request, final Sanabriabulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "author", "song");
	}

}
