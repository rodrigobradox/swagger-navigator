package br.com.banese.swaggerexplorer.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.banese.swaggerexplorer.dto.Api;
import br.com.banese.swaggerexplorer.util.ApiList;

@Service
public class ApiService {
	
	public Api getApi(String environment, String api) {
		return ApiList.getInstance().getApi(environment, api);
	}
	
    public List<Api> getApiList(String environment) {
        return ApiList.getInstance().getApiList(environment);
    }	
	
}
