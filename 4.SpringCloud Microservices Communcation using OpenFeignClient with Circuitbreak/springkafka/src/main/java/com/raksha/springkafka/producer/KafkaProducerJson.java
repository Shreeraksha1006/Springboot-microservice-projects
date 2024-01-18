package com.raksha.springkafka.producer;

import com.raksha.springkafka.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerJson {
    public static final Logger LOGGER= LoggerFactory.getLogger(KafkaProducerJson.class);
    private KafkaTemplate<String,User> kafkaTemplate;

    KafkaProducerJson(KafkaTemplate<String,User> kafkaTemplate){
        this.kafkaTemplate=kafkaTemplate;
    }

    public void sendJsonMessage(User user){
        Message<User> message = MessageBuilder
                .withPayload(user).setHeader(KafkaHeaders.TOPIC,"myTopic2").build();
     kafkaTemplate.send(message);
     LOGGER.info("Message sent to topic");
    }

}
