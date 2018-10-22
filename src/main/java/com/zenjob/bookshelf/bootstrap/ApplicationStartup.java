package com.zenjob.bookshelf.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class ApplicationStartup {
	
	public static void main(String... args) {
		SpringApplication.run(ApplicationStartup.class, args);
	}
}
