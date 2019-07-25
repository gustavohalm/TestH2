package com.xbrain.TestH2.RabbitMq;

import com.xbrain.TestH2.Models.Entrega;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMqSender {
    private final RabbitTemplate rabbitTemplate;

    @Autowired
    public RabbitMqSender(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public Entrega sendOrder(Entrega entrega) {
        this.rabbitTemplate.convertAndSend(RabbiMqConfig.QUEUE_ORDERS, entrega);
        return entrega;
    }
}
