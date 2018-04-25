package com.quanwei.listeners;

import com.alibaba.fastjson.JSONObject;
import javax.jms.JMSException;
import javax.jms.Session;
import javax.jms.TextMessage;
import org.springframework.jms.listener.SessionAwareMessageListener;

/**
 * Created by chenxuewei on 2018/4/23.
 * 自己写消费
 */
public class MyMessageReceiver implements SessionAwareMessageListener<TextMessage> {

  @Override
  public void onMessage(TextMessage textMessage, Session session) throws JMSException {
    //消息内容为json格式，需要自行解析转化
    JSONObject object = JSONObject.parseObject(textMessage.getText());
    System.out.println(object);
  }
}
