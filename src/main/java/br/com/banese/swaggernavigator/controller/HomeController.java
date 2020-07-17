package br.com.banese.swaggernavigator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping({"/swagger-navigator"})
	public String home() {
		//return "redirect:/swagger-navigator/index.html";
		return "home";
	}
	
}
