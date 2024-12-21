package com.web;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Javed
 */
@Service
public class GreetingService {
	private static final String URL = "http://greeting";
	private RestTemplate rest;

	public GreetingService(RestTemplate rest) {
		this.rest = rest;
	}

	public String getGreeting() {
		return rest.getForObject(URL, String.class);
	}

	public String getGreeting(String locale) {
		//return rest.getForObject(URL + "/" + locale, String.class);
		System.out.println("Locale : "+ locale);
		return rest.getForObject(new StringBuilder().append(URL).append("/").append(locale).toString(), String.class);
	}
}
