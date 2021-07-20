package com.mohsindk786.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    @Autowired
    private RabbitMqSettings mqSettings;

    @Bean
    public DirectExchange directExchange(){
        return new DirectExchange(mqSettings.getExchange());
    }

    @Bean
    public Queue queue(){
        return new Queue(mqSettings.getQueue());
    }

    @Bean
    public Binding binding(){
        return BindingBuilder.bind(queue()).to(directExchange()).with(mqSettings.getRoutingKey());
    }

    @Bean
    public DirectExchange orgExchange(){
        return new DirectExchange(mqSettings.getOrgExchange());
    }

    @Bean
    public Queue orgQueue(){
        return new Queue(mqSettings.getOrgQueue());
    }

    @Bean
    public Binding orgBinding(){
        return BindingBuilder.bind(orgQueue()).to(orgExchange()).with(mqSettings.getOrgRoutingKey());
    }
}
