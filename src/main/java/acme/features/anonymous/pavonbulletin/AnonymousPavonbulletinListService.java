
package acme.features.anonymous.pavonbulletin;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.pavonbulletins.Pavonbulletin;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousPavonbulletinListService implements AbstractListService<Anonymous, Pavonbulletin> {

	// Internal state ----------------------------------------------------------

	@Autowired
	AnonymousPavonbulletinRepository repository;


	// AbstractListService<Anonymous, Shout> interface --------------------

	@Override
	public boolean authorise(final Request<Pavonbulletin> request) {
		assert request != null;

		return true;
	}

	@Override
	public Collection<Pavonbulletin> findMany(final Request<Pavonbulletin> request) {
		assert request != null;

		Collection<Pavonbulletin> result;

		result = this.repository.findMany();

		return result;
	}

	@Override
	public void unbind(final Request<Pavonbulletin> request, final Pavonbulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "author", "text", "date");
	}

}
