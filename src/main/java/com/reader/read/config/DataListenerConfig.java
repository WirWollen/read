package com.reader.read.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.reader.read.dtos.ItemDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class DataListenerConfig {

    @KafkaListener(topics = "parsed-item", groupId = "app.1")
    public void listenerData(String itemDto) throws JsonProcessingException {
        System.out.println("Received Item: " + itemDto.toString());
    }

}
