package com.mohsinkd786.service.amqp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class MessageListener {
    private static final Logger logger = LoggerFactory.getLogger(MessageListener.class);

    @RabbitListener(queues = "${rabbitmq.queue}" )
    public void onMessage(String message){
        logger.info("AMQP MESSAGE : "+message);
    }
}
