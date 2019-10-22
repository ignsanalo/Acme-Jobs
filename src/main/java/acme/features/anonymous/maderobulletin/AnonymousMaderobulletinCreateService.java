
package acme.features.anonymous.maderobulletin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.maderobulletins.Maderobulletin;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractCreateService;

@Service
public class AnonymousMaderobulletinCreateService implements AbstractCreateService<Anonymous, Maderobulletin> {

	// Internal state ----------------------------------------------------------

	@Autowired
	AnonymousMaderobulletinRepository repository;


	@Override
	public boolean authorise(final Request<Maderobulletin> request) {
		assert request != null;

		return true;
	}

	@Override
	public Maderobulletin instantiate(final Request<Maderobulletin> request) {
		assert request != null;

		Maderobulletin result;

		result = new Maderobulletin();
		result.setAuthor("");
		result.setPhoto("");

		return result;
	}

	@Override
	public void unbind(final Request<Maderobulletin> request, final Maderobulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "author", "photo");
	}

	@Override
	public void bind(final Request<Maderobulletin> request, final Maderobulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);

	}

	@Override
	public void validate(final Request<Maderobulletin> request, final Maderobulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

	}

	@Override
	public void create(final Request<Maderobulletin> request, final Maderobulletin entity) {
		assert request != null;
		assert entity != null;

		this.repository.save(entity);

	}

}
