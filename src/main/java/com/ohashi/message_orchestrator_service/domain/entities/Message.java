package com.ohashi.message_orchestrator_service.domain.entities;

public record Message(Header header, Body body, ConfigurationMessage configurationMessage) {
}
