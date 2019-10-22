
package acme.features.anonymous.pavonbulletin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.pavonbulletins.Pavonbulletin;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractCreateService;

@Service
public class AnonymousPavonbulletinCreateService implements AbstractCreateService<Anonymous, Pavonbulletin> {

	// Internal state ----------------------------------------------------------

	@Autowired
	AnonymousPavonbulletinRepository repository;


	@Override
	public boolean authorise(final Request<Pavonbulletin> request) {
		assert request != null;

		return true;
	}

	@Override
	public Pavonbulletin instantiate(final Request<Pavonbulletin> request) {
		assert request != null;

		Pavonbulletin result;

		result = new Pavonbulletin();
		result.setAuthor("");
		result.setText("");
		result.setDate(null);

		return result;
	}

	@Override
	public void unbind(final Request<Pavonbulletin> request, final Pavonbulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "author", "text", "date");
	}

	@Override
	public void bind(final Request<Pavonbulletin> request, final Pavonbulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);

	}

	@Override
	public void validate(final Request<Pavonbulletin> request, final Pavonbulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

	}

	@Override
	public void create(final Request<Pavonbulletin> request, final Pavonbulletin entity) {
		assert request != null;
		assert entity != null;

		this.repository.save(entity);

	}

}
