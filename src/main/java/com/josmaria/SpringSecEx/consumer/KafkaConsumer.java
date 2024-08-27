package com.josmaria.SpringSecEx.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "getting-started", groupId = "myGroup")
    public void consumerMessage(String msg) {
      log.info("Consuming the message from getting-started topic:: {}", msg);
    }
}
