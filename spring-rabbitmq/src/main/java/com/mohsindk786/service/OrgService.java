package com.mohsindk786.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mohsindk786.config.RabbitMqSettings;
import com.mohsindk786.dto.OrgDto;
import com.mohsindk786.service.amqp.AmqpPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrgService {

    @Autowired
    private RabbitMqSettings mqSettings;

    private AmqpPublisher amqpPublisher;

    @Autowired
    public void setAmqpPublisher(AmqpPublisher amqpPublisher) {
        this.amqpPublisher = amqpPublisher;
    }

    public boolean publishOrgToQueue(OrgDto orgDto){
        ObjectMapper mapper = new ObjectMapper();
        String message="";
        try{
            message = mapper.writeValueAsString(orgDto);
        }catch (JsonProcessingException ex){
            ex.printStackTrace();
        }
        amqpPublisher.publishToExchange(mqSettings.getOrgRoutingKey(), mqSettings.getOrgQueue(), message);
        return true;
    }
}
