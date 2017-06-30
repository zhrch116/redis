package com.kyee.rabbitmq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.handler.annotation.Payload;


/**
 * Created by zrc on 17/6/30.
 */
@Slf4j
@Configuration
@RabbitListener(queues = "foo")
public class Listener {
 @Bean
 public Queue fooQueue() {
  return new Queue("foo");
 }

 @RabbitHandler
 public void process(@Payload String foo) {
  System.out.println("Listener: " + foo);
  log.info("Listener: " + foo);
 }
}

