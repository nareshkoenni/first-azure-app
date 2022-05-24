package com.microservice.azure.firstazureapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstAzureAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstAzureAppApplication.class, args);
		System.out.println("hello");
	}
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello Azure spring boot";
	}

}
