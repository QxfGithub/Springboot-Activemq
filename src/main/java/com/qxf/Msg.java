package com.qxf;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.jms.core.MessageCreator;




public class Msg implements MessageCreator{
	
	private String message;
	
	public Msg(String message) {
		super();
		this.message = message;
	}


	@Override
	public Message createMessage(Session session)throws JMSException {
		//return session.createTextMessage("测试消息");
		return session.createTextMessage(message);
	}
	
}
