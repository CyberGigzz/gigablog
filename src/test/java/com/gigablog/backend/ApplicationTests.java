package com.gigablog.backend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.testcontainers.junit.jupiter.Testcontainers;

@SpringBootTest
@ActiveProfiles("test") 
@Testcontainers 
class ApplicationTests {

	@Test
	void contextLoads() {
	}

}
