package com.ace.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;


@SpringBootApplication
@EnableBinding(Sink.class)
public class SpringCloudKafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudKafkaConsumerApplication.class, args);
	}
	   private Logger logger = LoggerFactory.getLogger(SpringCloudKafkaConsumerApplication.class);

	    @StreamListener("input")
	    public void consumeMessage(com.ace.consumer.vo.Book book) {
	        logger.info("Consume payload : " + book);
	    }


	   
}
