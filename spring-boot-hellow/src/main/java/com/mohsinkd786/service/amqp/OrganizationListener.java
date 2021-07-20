package com.mohsinkd786.service.amqp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mohsinkd786.entity.Organization;
import com.mohsinkd786.service.OrganizationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizationListener {

    private static final Logger logger = LoggerFactory.getLogger(MessageListener.class);

    @Autowired
    private OrganizationService organizationService;

    @RabbitListener(queues = "${rabbitmq.org.queue}")
    public void onMessage(String message){
        logger.info("RECEIVED ORG :> "+message);
        ObjectMapper mapper = new ObjectMapper();
        try{
            Organization organization = mapper.readValue(message,Organization.class);
            //logger.info("PARSED ORG ^^^ "+organization);
            organizationService.createOrganization(organization);
        }catch (JsonProcessingException ex){
            ex.printStackTrace();
        }
    }
}
