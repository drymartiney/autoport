package com.chen.autoport.service.impl;

import com.chen.autoport.entity.VpnInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Anthor: chen
 * Date: 2020/3/28
 * Time: 15:29
 */
@Service
public class AsyncTaskService {
    @Autowired
    private VpnInfoServiceImpl vpnInfoService;
    @Async
    public void executeAsyncTask(int i) {
        System.out.println("线程" + Thread.currentThread().getName() + " 执行异步任务：" + i);
        //计数
        while (true){
            List<VpnInfo> vpnInfoList=vpnInfoService.findAll();
            for (VpnInfo vpnInfo:vpnInfoList){
                //System.out.println(vpnInfo);
                //System.out.println("time:"+(System.currentTimeMillis()-Long.parseLong(vpnInfo.getUseTime())+""));
//                if (vpnInfo.getUseTime()==null||vpnInfo.getUseTime()==""){
//                    vpnInfo.setUseTime("123");
//                }
                if (System.currentTimeMillis()-Long.parseLong(vpnInfo.getUseTime())>60*15*1000&&vpnInfo.getFlag()==2){
                    vpnInfoService.updateFlag(vpnInfo.getIp(),vpnInfo.getPort(),0,System.currentTimeMillis()+"");
                }
            }
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
