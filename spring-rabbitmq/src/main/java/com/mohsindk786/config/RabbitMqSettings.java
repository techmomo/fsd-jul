package com.mohsindk786.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class RabbitMqSettings {

    @Value("${rabbitmq.queue}")
    private String queue;
    @Value("${rabbitmq.exchange}")
    private String exchange;
    @Value("${rabbitmq.routingKey}")
    private String routingKey;

    @Value("${rabbitmq.org.queue}")
    private String orgQueue;
    @Value("${rabbitmq.org.exchange}")
    private String orgExchange;
    @Value("${rabbitmq.org.routingKey}")
    private String orgRoutingKey;

}
