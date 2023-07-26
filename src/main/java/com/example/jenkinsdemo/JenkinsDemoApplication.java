package com.example.jenkinsdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsDemoApplication {
	
	
	private static final Logger log = LoggerFactory.getLogger(JenkinsDemoApplication.class);

	
	@PostConstruct
	public void init() {
		log.info("application started");
}

	public static void main(String[] args) {
		log.info("application is ruuning");
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}

}
