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
public class RegisterController {

	private static final Logger logger = LoggerFactory.getLogger(RegisterController.class);

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registerForm(Model model) {
		logger.info("Register");
        MenuState menuState = new MenuState();
        menuState.setRegister(true);

        model.addAttribute("menuState", menuState);
		return "register";
	}

}
