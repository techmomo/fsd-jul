package com.mohsindk786.service.amqp;

import com.mohsindk786.config.RabbitMqSettings;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AmqpPublisher {

    private RabbitTemplate rabbitTemplate;

    @Autowired
    public void setRabbitTemplate(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void publishToExchange(String routingKey, String queueName , String message){
        rabbitTemplate.setRoutingKey(routingKey);
        rabbitTemplate.convertAndSend(queueName,message);
    }
}
