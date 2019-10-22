
package acme.features.anonymous.gallardobulletin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.gallardobulletins.Gallardobulletin;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractCreateService;

@Service
public class AnonymousGallardobulletinCreateService implements AbstractCreateService<Anonymous, Gallardobulletin> {

	// Internal state ----------------------------------------------------------

	@Autowired
	AnonymousGallardobulletinRepository repository;


	@Override
	public boolean authorise(final Request<Gallardobulletin> request) {
		assert request != null;

		return true;
	}

	@Override
	public Gallardobulletin instantiate(final Request<Gallardobulletin> request) {
		assert request != null;

		Gallardobulletin result;

		result = new Gallardobulletin();
		result.setAuthor("");
		result.setSongAuthor("");

		return result;
	}

	@Override
	public void unbind(final Request<Gallardobulletin> request, final Gallardobulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "author", "songAuthor");
	}

	@Override
	public void bind(final Request<Gallardobulletin> request, final Gallardobulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);

	}

	@Override
	public void validate(final Request<Gallardobulletin> request, final Gallardobulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

	}

	@Override
	public void create(final Request<Gallardobulletin> request, final Gallardobulletin entity) {
		assert request != null;
		assert entity != null;

		this.repository.save(entity);

	}

}
