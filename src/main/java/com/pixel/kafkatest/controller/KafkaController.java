package com.pixel.kafkatest.controller;

import com.pixel.kafkatest.helper.KafkaMessageSender;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
public class KafkaController {
    private final KafkaMessageSender kafkaMessageSender;

    @PutMapping(value = "/kafka")
    public void kafkaTest(){
       kafkaMessageSender.sendMessage(String.format("This is a simple message to Kafka! - time: %tr", LocalDateTime.now()), "KafkaTopicTest-1");
    }
}
