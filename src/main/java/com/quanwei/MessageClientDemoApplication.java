package com.quanwei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath*:spring-activemq-client.xml")
public class MessageClientDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessageClientDemoApplication.class, args);
	}
}
