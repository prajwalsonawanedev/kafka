package com.example.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaLearningApplication.class, args);
		System.out.println("Learing with kafka");
	}

}
