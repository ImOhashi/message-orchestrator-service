package com.app.message_orchestrator_service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class MessageOrchestratorServiceApplicationTests {

	@Test
	void contextLoads() {
	}

}
