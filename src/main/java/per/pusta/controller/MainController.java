package per.pusta.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import per.pusta.controller.util.MenuStateBean;

@Controller
public class MainController {

	private static final Logger logger = LoggerFactory.getLogger(MainController.class);

	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String loginForm(Model model) {
		logger.info("Main");
        MenuStateBean menuState = new MenuStateBean();
        menuState.setMain(true);

        model.addAttribute("menuState", menuState);
		return "main";
	}

}
