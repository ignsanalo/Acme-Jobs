
package acme.features.anonymous.sanabriabulletin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.sanabriabulletins.Sanabriabulletin;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractCreateService;

@Service
public class AnonymousSanabriabulletinCreateService implements AbstractCreateService<Anonymous, Sanabriabulletin> {

	// Internal state ----------------------------------------------------------

	@Autowired
	AnonymousSanabriabulletinRepository repository;


	@Override
	public boolean authorise(final Request<Sanabriabulletin> request) {
		assert request != null;

		return true;
	}

	@Override
	public Sanabriabulletin instantiate(final Request<Sanabriabulletin> request) {
		assert request != null;

		Sanabriabulletin result;

		result = new Sanabriabulletin();
		result.setAuthor("");
		result.setSong("");

		return result;
	}

	@Override
	public void unbind(final Request<Sanabriabulletin> request, final Sanabriabulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "author", "song");
	}

	@Override
	public void bind(final Request<Sanabriabulletin> request, final Sanabriabulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);

	}

	@Override
	public void validate(final Request<Sanabriabulletin> request, final Sanabriabulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

	}

	@Override
	public void create(final Request<Sanabriabulletin> request, final Sanabriabulletin entity) {
		assert request != null;
		assert entity != null;

		this.repository.save(entity);

	}

}
