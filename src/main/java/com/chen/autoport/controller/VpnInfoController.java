package com.chen.autoport.controller;

import com.chen.autoport.entity.VpnInfo;
import com.chen.autoport.service.impl.VpnInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Anthor: chen
 * Date: 2020/3/28
 * Time: 11:01
 */
@RestController
@RequestMapping
public class VpnInfoController {

    @Autowired
    private VpnInfoServiceImpl vpnInfoService;

    @GetMapping("/getOneIpAndPort")
    public VpnInfo getOneIpAndPort(@RequestParam("type")String type){
        List<VpnInfo> vpnInfo=vpnInfoService.findOne(type);
        System.out.println(vpnInfo);
        if (vpnInfo.toString()!="[]"){
            vpnInfoService.updateFlag(vpnInfo.get(0).getIp(),vpnInfo.get(0).getPort(),2,System.currentTimeMillis()+"");
            return vpnInfo.get(0);
        }
        return null;
    }

    @GetMapping("/updatePortByIp")
    public Integer updatePortByIp(@RequestParam("ip")String ip,
                                  @RequestParam("port")Integer port){
        Integer result=vpnInfoService.updateFlag(ip,port,2,System.currentTimeMillis()+"");
        return result;
    }

}
