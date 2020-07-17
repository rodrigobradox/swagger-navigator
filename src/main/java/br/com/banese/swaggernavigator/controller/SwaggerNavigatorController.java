package br.com.banese.swaggernavigator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping( { "/swagger-navigator" } )
public class SwaggerNavigatorController {

	@GetMapping
	public String redirectToSwaggerNavigatorIndex() {
		return "redirect:/swagger-navigator/index.html";
	}
	
}
