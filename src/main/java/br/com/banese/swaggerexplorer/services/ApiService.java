package br.com.banese.swaggerexplorer.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.banese.swaggerexplorer.dto.Api;
import br.com.banese.swaggerexplorer.util.ApiPropertiesUtil;

@Service
public class ApiService {
	
	public Api getApi(String environment, String api) {
		return ApiPropertiesUtil.getInstance().getApi(environment, api);
	}
	
    public List<Api> getApiList(String environment) {
        return ApiPropertiesUtil.getInstance().getApiList(environment);
    }	
	
}
