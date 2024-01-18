package com.raksha.springkafka.controller;

import com.raksha.springkafka.dto.User;
import com.raksha.springkafka.producer.KafkaProducer;
import com.raksha.springkafka.producer.KafkaProducerJson;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {
  //  private KafkaProducer kafkaProducer;
    private KafkaProducerJson kafkaJsonProducer;
//    KafkaController(KafkaProducer kafkaProducer){
//        this.kafkaProducer=kafkaProducer;
//    }
    KafkaController(KafkaProducerJson kafkaProducerJson){
        this.kafkaJsonProducer=kafkaProducerJson;
    }
    //http://localhost:8080/api/kafka/publish?message=
//    @GetMapping("/publish")
//    public ResponseEntity<String> sendMessage(@RequestParam("message") String message){
//        kafkaProducer.sendMessage(message);
//        return new ResponseEntity<>("Message sent to topic", HttpStatus.OK);
//
//
//    }
    @PostMapping("/publishUser")
    public ResponseEntity<String> sendMessage(@RequestBody User user) {
        kafkaJsonProducer.sendJsonMessage(user);
        return new ResponseEntity<>("Message sent to topic", HttpStatus.OK);
    }
}
