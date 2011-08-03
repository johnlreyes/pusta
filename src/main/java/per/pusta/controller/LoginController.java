package per.pusta.controller;

import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import per.pusta.controller.util.MenuState;

@Controller
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginForm(Model model) {
		logger.info("Login");
        MenuState menuState = new MenuState();
        menuState.setLogin(true);

        model.addAttribute("menuState", menuState);
		return "login";
	}

}
