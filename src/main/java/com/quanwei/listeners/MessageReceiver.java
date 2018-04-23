package com.quanwei.listeners;

import javax.jms.JMSException;
import javax.jms.Session;
import javax.jms.TextMessage;
import org.springframework.jms.listener.SessionAwareMessageListener;

/**
 * Created by chenxuewei on 2018/4/23.
 */
public class MessageReceiver implements SessionAwareMessageListener<TextMessage> {

  @Override
  public void onMessage(TextMessage textMessage, Session session) throws JMSException {
    System.out.println(textMessage.getText());
  }
}
