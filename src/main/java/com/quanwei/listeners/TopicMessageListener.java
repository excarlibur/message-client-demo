package com.quanwei.listeners;

import com.quanwei.ewifi.system.message.MsgCode;
import com.quanwei.ewifi.system.message.Source;
import com.quanwei.ewifi.system.message.SystemMessage;
import com.quanwei.ewifi.system.receive.MessageListener;
import java.util.List;

/**
 * Created by chenxuewei on 2018/4/22.
 */
//@Component
public class TopicMessageListener implements MessageListener {

    @Override
    public void onMessage(SystemMessage message) {

        if(message.getSource().equals(Source.TABLE_BUSINESS)){
            if(message.getMsgCode().equals(MsgCode.TABLE_CREATE)){
                //商家表创建了一组记录

                //ids为商家ids
                List<Long> ids = (List<Long>) message.getPara();
            }
        }

        System.out.println("11111");
    }

    @Override
    public MsgCode getMessageCode() {
        //监听数据的创建修改删除
        return MsgCode.TABLE_GROUP;
    }
}
