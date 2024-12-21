package com.web;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

/**
 * @author Javed
 */
@Service
@EnableFeignClients
public class NameService {
	//private static final String URL = "http://localhost:7070";
	private static final String URL = "http://name";
	private RestTemplate rest;
	public NameService(RestTemplate rest) {
		this.rest = rest;
	}
	public String getName() {
		return rest.getForObject(URL, String.class);
	}


//	private NameFeignClient nameFeignClient;
//	public NameService(NameFeignClient nameFeignClient){
//		this.nameFeignClient = nameFeignClient;
//	}
//	public String getName(){
//		return nameFeignClient.getName();
//	}
//	@FeignClient(name = "name")
//	static interface NameFeignClient {
//		@RequestMapping("/")
//		public String getName();
//	}

}
