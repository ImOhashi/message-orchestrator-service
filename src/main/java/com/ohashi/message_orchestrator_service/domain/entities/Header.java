package com.ohashi.message_orchestrator_service.domain.entities;

import com.ohashi.message_orchestrator_service.domain.entities.enums.Channel;

public record Header(String from, String to) {
}
