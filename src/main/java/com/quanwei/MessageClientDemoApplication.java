package com.quanwei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//依赖 ewifi-message-client-2.0.0.jar
//@ImportResource("classpath*:spring-activemq-client.xml")
//自己写消费者
@ImportResource("classpath:spring-activemq.xml")
public class MessageClientDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessageClientDemoApplication.class, args);
	}
}
