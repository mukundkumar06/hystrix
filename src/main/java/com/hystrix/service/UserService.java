package com.hystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
	@HystrixCommand(fallbackMethod = "defaultName", commandKey = "demo")
	public String getName(String username) {
		return new RestTemplate()
				.getForObject("http://localhost:8888/welcome/{username}",
						String.class, username);
	}

	private String defaultName(String username, Throwable t) {
		System.out.println(t);
		return "Hello User!";
	}
}
