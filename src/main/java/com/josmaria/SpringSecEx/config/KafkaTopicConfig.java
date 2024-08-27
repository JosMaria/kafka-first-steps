package com.josmaria.SpringSecEx.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic gettingStartedTopic() {
        return TopicBuilder.name("getting-started").build();
    }
}
