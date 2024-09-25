package com.marymusa.boardgamejournal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
public class BoardGameJournalApplication {

	private static final Logger logger = LoggerFactory.getLogger(BoardGameJournalApplication.class);

	public static void main(String[] args) {
		logger.info("Starting the BoardGameJournalApplication...");
		SpringApplication.run(BoardGameJournalApplication.class, args);
		logger.info("BoardGameJournalApplication has started successfully.");
	}
}

	// Add the controller.
	@RestController
	class HelloWorldController {
		@GetMapping("/")
		public String hello() {
			return "hello Board Game Journal world!☀\uFE0F";
		}
	}

