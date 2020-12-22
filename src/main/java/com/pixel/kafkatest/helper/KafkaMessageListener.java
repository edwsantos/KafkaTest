package com.pixel.kafkatest.helper;

import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class KafkaMessageListener {

    @KafkaListener(topics = "KafkaTopicTest-1", groupId = "EdwinGroup")
    public void commonListenerForMultipleTopics(final String message){
        log.info("Listening message - {}", message);
    }
}
