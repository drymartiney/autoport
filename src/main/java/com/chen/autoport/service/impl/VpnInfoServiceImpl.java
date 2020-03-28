package com.chen.autoport.service.impl;

import com.chen.autoport.dao.VpnInfoDao;
import com.chen.autoport.entity.VpnInfo;
import com.chen.autoport.service.VpnInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Anthor: chen
 * Date: 2020/3/28
 * Time: 11:28
 */
@Service
public class VpnInfoServiceImpl implements VpnInfoService {

    @Autowired
    private VpnInfoDao vpnInfoDao;

    @Override
    public List<VpnInfo> findOne(String type) {

        return vpnInfoDao.findByType(type);
    }

    @Override
    public Integer updateFlag(String ip,Integer id,Integer flag,String useTime) {
        return vpnInfoDao.updateFlag(ip,id,flag,useTime);
    }

    @Override
    public List<VpnInfo> findAll() {
        return vpnInfoDao.findAll();
    }
}
