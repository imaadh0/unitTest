package com.javatechie.azure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureDemoApplication {

	private final MyService myService;

	public SpringAzureDemoApplication(MyService myService) {
		this.myService = myService;
	}

	@GetMapping("/message")
	public String message() {
		return "DevOps Project";
	}

	@GetMapping("/sum")
	public int sum() {
		int result = myService.doSomeLogic(2, 3);
		return result;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAzureDemoApplication.class, args);
	}

}
