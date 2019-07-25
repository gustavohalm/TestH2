package com.xbrain.TestH2.RabbitMq;

import com.xbrain.TestH2.Models.Entrega;
import com.xbrain.TestH2.Repositories.EntregaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

@Component
public class RabbitMqReceiver {
    @Autowired
    private EntregaRepository entregaRepository;

    static final Logger logger = LoggerFactory.getLogger(RabbitMqReceiver.class);

    @RabbitListener(queues = RabbiMqConfig.QUEUE_ORDERS)
    public void processOrder(Entrega entrega) {
        entregaRepository.save(entrega);
        logger.info("Order Received: "+ entrega);
    }

}
