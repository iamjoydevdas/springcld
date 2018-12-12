package org.Registration.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("registration")
public class RegistrationController {
	
	@RequestMapping(value="/ping", method= RequestMethod.GET)
	public String ping() {
		return "Hello Registration";
	}

}
