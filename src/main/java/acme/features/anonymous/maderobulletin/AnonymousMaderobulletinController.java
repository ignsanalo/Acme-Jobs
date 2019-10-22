
package acme.features.anonymous.maderobulletin;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.maderobulletins.Maderobulletin;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Anonymous;

@Controller
@RequestMapping("/anonymous/maderobulletin/")

public class AnonymousMaderobulletinController extends AbstractController<Anonymous, Maderobulletin> {

	// Internal state ---------------------------------------------------------

	@Autowired
	private AnonymousMaderobulletinListService		listService;

	@Autowired
	private AnonymousMaderobulletinCreateService	createService;


	// Constructors -----------------------------------------------------------

	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.CREATE, this.createService);
	}

}
