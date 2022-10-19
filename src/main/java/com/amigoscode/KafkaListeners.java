package com.amigoscode;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "amigoscode", groupId = "meinGroupId") // valid for Spring Boot app
    void listener(String data) {
        System.out.println("Listener received " + data );
    }
}
