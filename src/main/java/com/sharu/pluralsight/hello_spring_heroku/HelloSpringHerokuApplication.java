package com.sharu.pluralsight.hello_spring_heroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloSpringHerokuApplication {
	@GetMapping("/hellops")
	public String helloHeroku()
	{
		return "Hello from pluralsight course";
	}
	public static void main(String[] args) {

		SpringApplication.run(HelloSpringHerokuApplication.class, args);
	}

}
