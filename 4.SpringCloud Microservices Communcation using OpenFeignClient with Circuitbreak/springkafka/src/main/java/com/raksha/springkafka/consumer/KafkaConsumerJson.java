package com.raksha.springkafka.consumer;

import com.raksha.springkafka.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerJson {
    public static final Logger LOGGER= LoggerFactory.getLogger(KafkaConsumerJson.class);
    @KafkaListener(topics = "myTopic2",groupId = "group_id")
    public void consume(User user){

       LOGGER.info(String.format("Message Received : %s",user));
    }

}
