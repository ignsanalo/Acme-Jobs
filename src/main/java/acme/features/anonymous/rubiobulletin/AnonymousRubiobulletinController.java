
package acme.features.anonymous.rubiobulletin;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.rubiobulletins.Rubiobulletin;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Anonymous;

@Controller
@RequestMapping("/anonymous/rubiobulletin/")
public class AnonymousRubiobulletinController extends AbstractController<Anonymous, Rubiobulletin> {

	// Internal state ---------------------------------------------------------

	@Autowired
	private AnonymousRubiobulletinListService	listService;

	@Autowired
	private AnonymousRubiobulletinCreateService	createService;


	// Constructors -----------------------------------------------------------

	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.CREATE, this.createService);
	}

}
