
package acme.features.anonymous.sanabriabulletin;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.sanabriabulletins.Sanabriabulletin;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Anonymous;

@Controller
@RequestMapping("/anonymous/sanabriabulletin/")

public class AnonymousSanabriabulletinController extends AbstractController<Anonymous, Sanabriabulletin> {

	// Internal state ---------------------------------------------------------

	@Autowired
	private AnonymousSanabriabulletinListService	listService;

	@Autowired
	private AnonymousSanabriabulletinCreateService	createService;


	// Constructors -----------------------------------------------------------

	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.CREATE, this.createService);
	}

}
