package com.iasolutions.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		System.out.println("Usuario BD: " + System.getenv("DB_USER"));
		System.out.println("Password BD: " + System.getenv("DB_PASS"));

		//PasswordEncoder encoder = new BCryptPasswordEncoder();
		//System.out.println("Encoded password for 'admin': " + encoder.encode("admin123"));
	}

}
