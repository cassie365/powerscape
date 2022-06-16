package com.colvindesign.powerscape;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class PowerscapeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PowerscapeApplication.class, args);
	}

}
