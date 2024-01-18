package com.raksha.springkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

public class KafkaTopic {
    @Bean
    public NewTopic topic(){
        return TopicBuilder.name("myTopic").build();
    }
}
