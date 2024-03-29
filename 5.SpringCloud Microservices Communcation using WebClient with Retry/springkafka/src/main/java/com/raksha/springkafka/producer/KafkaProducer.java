package com.raksha.springkafka.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
    private static final Logger LOGGER= LoggerFactory.getLogger(KafkaProducer.class);
private KafkaTemplate kafkaTemplate;

    KafkaProducer(KafkaTemplate kafkaTemplate){
        this.kafkaTemplate=kafkaTemplate;
    }
    public void sendMessage(String message){
        LOGGER.info(String.format("Message sent %s",message));
        kafkaTemplate.send("myTopic",message);
    }
}
