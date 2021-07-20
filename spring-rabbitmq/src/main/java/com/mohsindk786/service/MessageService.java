package com.mohsindk786.service;

import com.mohsindk786.config.RabbitMqSettings;
import com.mohsindk786.service.amqp.AmqpPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private AmqpPublisher amqpPublisher;
    @Autowired
    private RabbitMqSettings mqSettings;

    @Autowired
    public void setAmqpPublisher(AmqpPublisher amqpPublisher) {
        this.amqpPublisher = amqpPublisher;
    }

    // push message to rabbit mq broker
    public boolean publishMessage(String message){
        amqpPublisher.publishToExchange(mqSettings.getRoutingKey(), mqSettings.getQueue(), message);
        return true;
    }
}
