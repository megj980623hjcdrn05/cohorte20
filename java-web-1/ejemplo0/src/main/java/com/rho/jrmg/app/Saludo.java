package com.rho.jrmg.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludo {
	@RequestMapping("/2")
	public  String saludar(){
		return "hola mundo desde spring";
	}
}
