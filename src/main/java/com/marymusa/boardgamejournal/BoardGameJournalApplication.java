package com.marymusa.boardgamejournal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BoardGameJournalApplication {

	private static final Logger logger = LoggerFactory.getLogger(BoardGameJournalApplication.class);

	public static void main(String[] args) {
		logger.info("Starting the BoardGameJournalApplication...");
		SpringApplication.run(BoardGameJournalApplication.class, args);
		logger.info("BoardGameJournalApplication has started successfully.");
	}

}
