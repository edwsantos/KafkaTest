package com.pixel.kafkatest.config;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import java.util.Map;

@Configuration
public class KafkaProducerConfig {

    @Value("${spring.kafka.boostrap-servers}")
    private String boostrapServers;

    private Map<String, Object> producerProperties(){
        return Map.of(
                ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, boostrapServers,
                ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class,
                ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class
        );
    }

    @Bean
    public ProducerFactory<String, String> producerFactory(){
        return new DefaultKafkaProducerFactory<>(producerProperties());
    }

    @Bean
    public KafkaTemplate<String, String> kafkaTemplate(){
        return new KafkaTemplate<>(producerFactory());
    }
}
