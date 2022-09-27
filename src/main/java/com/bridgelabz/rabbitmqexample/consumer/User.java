//package com.bridgelabz.rabbitmqexample.consumer;
//import com.bridgelabz.rabbitmqexample.config.MessagingConfig;
//import com.bridgelabz.rabbitmqexample.dto.OrderStatus;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Component;
//
//@Component
//public class User {
//    @RabbitListener(queues = MessagingConfig.QUEUE)
//    public void consumeMessageFromQueue(OrderStatus orderStatus) {
//        System.out.println("Message recieved from queue : " + orderStatus);
//    }
//}
