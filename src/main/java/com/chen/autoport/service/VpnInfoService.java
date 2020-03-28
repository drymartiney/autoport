package com.chen.autoport.service;

import com.chen.autoport.entity.VpnInfo;

import java.util.List;

/**
 * Anthor: chen
 * Date: 2020/3/28
 * Time: 11:25
 */
public interface VpnInfoService {
    List<VpnInfo> findOne(String type);

    Integer updateFlag(String ip,Integer id,Integer flag,String useTime);

    List<VpnInfo> findAll();
}
