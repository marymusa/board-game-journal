package com.marymusa.boardgamejournal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BoardGameJournalApplicationTests {

	@Test
	void contextLoads() { // only load for now
	}

	@Test
    void dummyTest() {
		Assertions.assertEquals("Dummy","Dum"+"my");
    }

}
