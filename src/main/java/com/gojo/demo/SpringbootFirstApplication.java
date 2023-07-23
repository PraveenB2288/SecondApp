package com.gojo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class SpringbootFirstApplication {

	@RequestMapping(value = "hello", method = RequestMethod.GET )
	public String hello() {
		return "Hellooooooooo";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootFirstApplication.class, args);
	}

}
