
package acme.features.anonymous.rubiobulletin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.rubiobulletins.Rubiobulletin;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractCreateService;

@Service
public class AnonymousRubiobulletinCreateService implements AbstractCreateService<Anonymous, Rubiobulletin> {

	// Internal state ----------------------------------------------------------

	@Autowired
	AnonymousRubiobulletinRepository repository;


	@Override
	public boolean authorise(final Request<Rubiobulletin> request) {
		assert request != null;

		return true;
	}

	@Override
	public Rubiobulletin instantiate(final Request<Rubiobulletin> request) {
		assert request != null;

		Rubiobulletin result;

		result = new Rubiobulletin();
		result.setAuthor("");
		result.setLink("");

		return result;
	}

	@Override
	public void unbind(final Request<Rubiobulletin> request, final Rubiobulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "author", "link");
	}

	@Override
	public void bind(final Request<Rubiobulletin> request, final Rubiobulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);

	}

	@Override
	public void validate(final Request<Rubiobulletin> request, final Rubiobulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

	}

	@Override
	public void create(final Request<Rubiobulletin> request, final Rubiobulletin entity) {
		assert request != null;
		assert entity != null;

		this.repository.save(entity);

	}

}
