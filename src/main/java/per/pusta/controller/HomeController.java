package per.pusta.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import per.pusta.controller.util.MenuStateBean;

@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Model model) {
		logger.info("Welcome home!");
        MenuStateBean menuState = new MenuStateBean();
        menuState.setHome(true);

        model.addAttribute("menuState", menuState);
		model.addAttribute("current_date", new Date().toString());
		model.addAttribute("test", "test");
		return "home";
	}

}
