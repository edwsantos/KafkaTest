package com.pixel.kafkatest.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

public class KafkaTopicConfig {
    @Bean
    public NewTopic topic1(){
        return TopicBuilder.name("KafkaTopicTest-1").build();
    }

    @Bean
    public NewTopic topic2(){
        return TopicBuilder.name("KafkaTopicTest-2").build();
    }
}
