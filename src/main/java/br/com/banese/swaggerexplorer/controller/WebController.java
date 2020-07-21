package br.com.banese.swaggerexplorer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.banese.swaggerexplorer.dto.Api;
import br.com.banese.swaggerexplorer.services.ApiService;
import br.com.banese.swaggerexplorer.util.ApiPropertiesUtil;

@Controller
@RequestMapping("swagger-explorer")
public class WebController {

	@Autowired
	ApiService service;
	
	@GetMapping
	public String home(ModelMap model) {
		
		List<Api> devApiList = service.getApiList(ApiPropertiesUtil.ENVIRONMENT_DEV);
		List<Api> hmlApiList = service.getApiList(ApiPropertiesUtil.ENVIRONMENT_HML);
		List<Api> localApiList = service.getApiList(ApiPropertiesUtil.ENVIRONMENT_LOCAL);
		
		model.addAttribute("devApiList", devApiList);
		model.addAttribute("hmlApiList", hmlApiList);
		model.addAttribute("localApiList", localApiList);
		
		return "home";
	}
	
}
