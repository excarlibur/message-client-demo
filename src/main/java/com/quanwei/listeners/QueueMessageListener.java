package com.quanwei.listeners;

import com.alibaba.fastjson.JSONArray;
import com.quanwei.ewifi.system.entity.ApResource;
import com.quanwei.ewifi.system.entity.Business;
import com.quanwei.ewifi.system.message.MsgCode;
import com.quanwei.ewifi.system.message.Source;
import com.quanwei.ewifi.system.message.SystemMessage;
import com.quanwei.ewifi.system.receive.MessageListener;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * Created by chenxuewei on 2018/4/22.
 */
@Component
public class QueueMessageListener implements MessageListener {

    @Override
    public void onMessage(SystemMessage message) {
        JSONArray.parseArray(message.getPara().toString(), ApResource.class);
        if(message.getSource().equals(Source.TABLE_AP)){
            if(message.getMsgCode().equals(MsgCode.TABLE_UPDATE)){
                //具体数据，由于ap有批量导入功能，所以消息统一传了集合
                //ap
                List<ApResource> apResources = JSONArray.parseArray(message.getPara().toString(), ApResource.class);
                //商家
                List<Business> businesses = JSONArray.parseArray(message.getPara().toString(), Business.class);
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
