package br.com.banese.swaggerexplorer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping({"/swagger-explorer"})
	public String home() {
		return "home";
	}
	
}
