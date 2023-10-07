package com.kk.apachekafkaconsumer.consumer;

import com.kk.dto.EmployeeDetails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;
    Logger logger = LoggerFactory.getLogger(KafkaMessageListener.class);


    @KafkaListener(topics = "quickstart-3" ,groupId = "group_id")
    public void consumer(String message){

        logger.info("Consumer1 received the message {}", message);
    }

    @KafkaListener(topics = "quickstart-3" ,groupId = "group_id")
    public void consumer1(String message){

        logger.info("Consumer2 received the message {}", message);
    }


    @KafkaListener(topics = "quickstart-3" ,groupId = "group_id")
    public void consumer2(String message){

        logger.info("Consumer3 received the message {}", message);
    }


    @KafkaListener(topics = "quickstart-3" ,groupId = "group_id")
    public void consumer3(String message){

        logger.info("Consumer4 received the message {}", message);
    }


    @KafkaListener(topics = "quickstart-4" ,groupId = "group_id")
    public void consumer4(EmployeeDetails message){

        logger.info("Consumer4 received the message {}", message);
    }
}
