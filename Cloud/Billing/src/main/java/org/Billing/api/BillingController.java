package org.Billing.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("billing")
public class BillingController {

	@RequestMapping("/ping")
	public String ping() {
		return "Hello Billing";
	}
}
