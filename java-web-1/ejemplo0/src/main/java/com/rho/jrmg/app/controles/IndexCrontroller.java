package com.rho.jrmg.app.controles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
@RequestMapping ("/2")
public class IndexCrontroller {
	@RequestMapping(value="2", method = RequestMethod.GET)
	public String getUserForm() {
		return "index";
	}
	
}
