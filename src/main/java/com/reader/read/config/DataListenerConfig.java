package com.reader.read.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.reader.read.dtos.ItemDto;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class DataListenerConfig {
    private final ObjectMapper objectMapper = new ObjectMapper();

    @KafkaListener(topics = "${spring.kafka.consumer.topic}", groupId = "${spring.kafka.consumer.group-id}")
    public void listenerData(String message) throws JsonProcessingException {
        ItemDto itemDto = objectMapper.readValue(message, ItemDto.class);

        System.out.println(itemDto.getId());
    }

}
