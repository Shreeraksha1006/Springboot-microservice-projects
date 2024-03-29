package com.raksha.springkafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    public static final Logger LOGGER= LoggerFactory.getLogger(KafkaConsumer.class);
    @KafkaListener(topics = "myTopic",groupId = "group-id")
    public void consume(String message){

   LOGGER.info(String.format("Message receiver -> %s",message));
    }
}
