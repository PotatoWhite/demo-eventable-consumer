package io.crcell.demo;


import io.crcell.pramework.eventable.consumer.EnableConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableConsumer
@SpringBootApplication
public class DemoEventableConsumerApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoEventableConsumerApplication.class, args);
  }

}
