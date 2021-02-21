package com.travel.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

	// TODO
	// attach mongoDB
	// -https://www.youtube.com/watch?v=k5PeywcbVYc
	// expose it via REST endpoints
}
