package com.app.message_orchestrator_service;

import org.springframework.boot.SpringApplication;

public class TestMessageOrchestratorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(MessageOrchestratorServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
