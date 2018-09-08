package com.qxf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.core.JmsTemplate;





@SpringBootApplication
public class ServerApplication implements CommandLineRunner{ //1
	
	@Autowired
	JmsTemplate jmsTemplate; //2

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
        
    }

	@Override
	public void run(String... args) throws Exception {
		jmsTemplate.send("my-destination", new Msg("消息1")); //3
		jmsTemplate.send("my-destination", new Msg("消息2")); //3
		jmsTemplate.send("my-destination", new Msg("消息3")); //3
		
	}
}
