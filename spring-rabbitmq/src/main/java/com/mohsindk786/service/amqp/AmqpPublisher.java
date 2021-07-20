package com.mohsindk786.service.amqp;

import com.mohsindk786.config.RabbitMqSettings;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AmqpPublisher {

    @Autowired
    private RabbitMqSettings mqSettings;
    private RabbitTemplate rabbitTemplate;

    @Autowired
    public void setRabbitTemplate(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void publishToExchange(String message){
        rabbitTemplate.setRoutingKey(mqSettings.getRoutingKey());
        rabbitTemplate.convertAndSend(mqSettings.getQueue(),message);
    }
}
