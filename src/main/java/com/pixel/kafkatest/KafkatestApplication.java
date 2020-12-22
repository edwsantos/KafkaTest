package com.pixel.kafkatest;

import com.pixel.kafkatest.helper.KafkaMessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkatestApplication {

	@Autowired
	private static KafkaMessageSender kafkaMessageSender;

	public static void main(String[] args) {
		SpringApplication.run(KafkatestApplication.class, args);
	}

}
