package com.chrismartain.springbootblogapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBlogApplication.class, args);
	}

	// Compiled Successfully several times but Lombok error annotation keeps popping up.
	// Lombok Message: Lombok require annotation enabled do you want to enable?
	// Have to find a way to permanently enable annotation for lombok

}
