package per.pusta.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import per.pusta.controller.util.MenuStateBean;

@Controller
public class DeniedController {

	private static final Logger logger = LoggerFactory.getLogger(DeniedController.class);

	@RequestMapping(value = "/denied", method = RequestMethod.GET)
	public String loginForm(Model model) {
		logger.info("Denied");
        MenuStateBean menuState = new MenuStateBean();
        menuState.setDenied(true);

        model.addAttribute("menuState", menuState);
		return "denied";
	}

}
