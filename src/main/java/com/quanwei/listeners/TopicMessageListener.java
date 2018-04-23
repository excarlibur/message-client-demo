package com.quanwei.listeners;

import com.quanwei.ewifi.system.message.MsgCode;
import com.quanwei.ewifi.system.message.SystemMessage;
import com.quanwei.ewifi.system.receive.MessageListener;
import org.springframework.stereotype.Component;

/**
 * Created by chenxuewei on 2018/4/22.
 */
@Component
public class TopicMessageListener implements MessageListener {

    @Override
    public void onMessage(SystemMessage systemMessage) {

        System.out.println("11111");

    }

    @Override
    public MsgCode getMessageCode() {
        return MsgCode.TABLE_GROUP;
    }
}
