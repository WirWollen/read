package com.reader.read;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@Configuration
@EnableKafka
public class ReadApplication {
	public static void main(String[] args) {
		SpringApplication.run(ReadApplication.class, args);
	}

}
