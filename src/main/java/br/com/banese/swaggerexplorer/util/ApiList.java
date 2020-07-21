package br.com.banese.swaggerexplorer.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

import org.springframework.stereotype.Component;

import com.google.gson.Gson;

import br.com.banese.swaggerexplorer.dto.Api;

@Component
public class ApiList {
	
	public static final String ENVIRONMENT_DEV = "dev";
	public static final String ENVIRONMENT_HML = "hml";
	public static final String ENVIRONMENT_LOCAL = "local";
	
	private static final String DEV_API_PROPERTY_FILE = "/api-dev.properties";	
	private static final String HML_API_PROPERTY_FILE = "/api-hml.properties";
	private static final String LOCAL_API_PROPERTY_FILE = "/api-local.properties";
	
	private Properties dev = new Properties();
	private Properties hml = new Properties();
	private Properties local = new Properties();
	
	private ApiList() {
		try {
			this.dev.load(getClass().getResourceAsStream(DEV_API_PROPERTY_FILE));
			this.hml.load(getClass().getResourceAsStream(HML_API_PROPERTY_FILE));
			this.local.load(getClass().getResourceAsStream(LOCAL_API_PROPERTY_FILE));
		} catch (IOException e) {
			e.printStackTrace();
			this.dev = null;
			this.hml = null;
			this.local = null;
		}
	}
	
    private static ApiList singleton;
    
    public static synchronized ApiList getInstance() {
    	if (singleton == null) {
    		singleton = new ApiList();
    	}
        return singleton;
    }
    
    private Properties getProperties(String environment) {
    	switch (environment) {
			case ENVIRONMENT_LOCAL:
				return this.local;
			case ENVIRONMENT_DEV:
				return this.dev;				
			case ENVIRONMENT_HML:
				return this.hml;
			default:
				return null;
		} 
    }
    
    public String getValue(String environment, String property) {
    	return this.getProperties(environment).getProperty(property);
    }
    
    public Api getApi(String environment, String api) {
    	Gson gson = new Gson();
		return gson.fromJson(this.getValue(environment, api), Api.class);
    }
    
    public List<Api> getApiList(String environment) {
    	List<Api> lista = new ArrayList<Api>();
    	Gson gson = new Gson();
    	
    	for (String key : this.getProperties(environment).stringPropertyNames()) {
    		lista.add(gson.fromJson(this.getProperties(environment).getProperty(key), Api.class));
    	}
    	
    	Collections.sort(lista);
    	return lista;
    }
    
    public static void main(String[] args) {
    	
//    	String property = "petstore";
//		String value = ApiList.getInstance().getValue(ENVIRONMENT_HML, property);
//		System.out.println(property + " - " + value);
//		
//		Api api = ApiList.getInstance().getApi(ENVIRONMENT_HML, property);
//		System.out.println(api.toString());
		
	}
	
}
