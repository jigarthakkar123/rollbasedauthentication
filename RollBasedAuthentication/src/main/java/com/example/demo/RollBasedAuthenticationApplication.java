package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RollBasedAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RollBasedAuthenticationApplication.class, args);
		System.out.println("Hello");
	}

}
