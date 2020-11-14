package com.ace.consumer.book;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

import com.ace.consumer.vo.Book;

import lombok.extern.slf4j.Slf4j;

//@EnableBinding(Sink.class)
@Slf4j
public class BookConsumer {
	
	//@StreamListener("input")
	public void consumeBook (Book book) {
		log.info(book.toString());
	}

}
