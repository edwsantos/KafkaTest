package com.pixel.kafkatest.helper;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class KafkaMessageSender {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message, String topicName){
        kafkaTemplate.send(topicName, message);
    }
}
