package com.example.Spring_Pipe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class SpringPipeApplication {
	@GetMapping("/cse")
	public String cse() {
		return "Welcome to the CSE Department";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringPipeApplication.class, args);
	}

}
