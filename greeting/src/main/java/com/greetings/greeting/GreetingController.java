package com.greetings.greeting;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Javed
 */
@RestController
public class GreetingController {
	private static final Logger LOG = Logger.getLogger(GreetingController.class.getName());

	private final GreetingProperties greetingProperties;

	public GreetingController(GreetingProperties greetingProperties) {
		this.greetingProperties = greetingProperties;
	}

	@RequestMapping("/{languageCode}")
	public String getGreeting(@PathVariable String languageCode){
		LOG.info("Language Code: " + languageCode.toUpperCase());
		//LOG.info("Greeting: " + greetingProperties.getGreetings().get(languageCode.substring(0, languageCode.indexOf("-")).toUpperCase()));
		if(!languageCode.isEmpty()){
			return greetingProperties.getGreetings().get(languageCode.toUpperCase());
		} else {
			return greetingProperties.getGreetings().get("EN");
		}
		//return greetingProperties.getGreetings().getOrDefault(languageCode.toUpperCase(), greetingProperties.getGreeting());
	}

	@RequestMapping("/")
	public String getGreeting(){
		LOG.info("Greeting: " + greetingProperties.getGreeting());
		return greetingProperties.getGreeting();
	}
}
