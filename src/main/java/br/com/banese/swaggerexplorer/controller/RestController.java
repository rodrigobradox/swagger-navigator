package br.com.banese.swaggerexplorer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.banese.swaggerexplorer.dto.Api;
import br.com.banese.swaggerexplorer.services.ApiService;

@Controller
@RequestMapping("swagger-explorer/rest")
public class RestController {
	
	@Autowired
	ApiService service;
	
	@GetMapping("/api-list/{api}")
    public @ResponseBody Api getApi(@RequestParam String environment,
    								@PathVariable String api) {
        return service.getApi(environment, api);
    }
	
	@GetMapping("/api-list")
    public @ResponseBody List<Api> getApiList(@RequestParam String environment) {
        return service.getApiList(environment);
    }
	
}
