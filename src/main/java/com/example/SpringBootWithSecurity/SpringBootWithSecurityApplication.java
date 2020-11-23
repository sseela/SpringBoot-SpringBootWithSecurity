package com.example.SpringBootWithSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.SpringBootWithSecurity"})
public class SpringBootWithSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithSecurityApplication.class, args);
	}

}
