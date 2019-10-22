
package acme.features.anonymous.gallardobulletin;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.gallardobulletins.Gallardobulletin;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Anonymous;

@Controller
@RequestMapping("/anonymous/gallardobulletin/")
public class AnonymousGallardobulletinController extends AbstractController<Anonymous, Gallardobulletin> {

	// Internal state ---------------------------------------------------------

	@Autowired
	private AnonymousGallardobulletinListService	listService;

	@Autowired
	private AnonymousGallardobulletinCreateService	createService;


	// Constructors -----------------------------------------------------------

	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.CREATE, this.createService);
	}

}
