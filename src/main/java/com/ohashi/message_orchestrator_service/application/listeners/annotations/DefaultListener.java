package com.ohashi.message_orchestrator_service.application.listeners.annotations;

import org.springframework.core.annotation.AliasFor;
import org.springframework.kafka.annotation.KafkaListener;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@KafkaListener
public @interface DefaultListener {

    @AliasFor(annotation = KafkaListener.class, attribute = "topics")
    String[] topics() default "message-orchestrator-topic";

    @AliasFor(annotation = KafkaListener.class, attribute = "groupId")
    String groupId() default "";
}
