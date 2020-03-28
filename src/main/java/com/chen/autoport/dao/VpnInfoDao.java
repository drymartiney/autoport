package com.chen.autoport.dao;

import com.chen.autoport.entity.VpnInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Anthor: chen
 * Date: 2020/3/28
 * Time: 11:04
 */
public interface VpnInfoDao extends JpaRepository<VpnInfo,Integer> {

    //获取所有端口
    @Modifying
    @Transactional
    @Query(value = "SELECT * from vpn_info",nativeQuery = true)
    List<VpnInfo> findAll();

    //获取一条未被占用的vpn信息
    @Modifying
    @Transactional
    @Query(value = "SELECT * from vpn_info WHERE type=?1 and flag!=2 OR flag IS NULL LIMIT 1",nativeQuery = true)
    List<VpnInfo> findByType(String type);

    //修改标注修改状态
    @Modifying
    @Transactional
    @Query(value = "UPDATE vpn_info SET flag=?3,use_time=?4 WHERE ip=?1 AND port=?2",nativeQuery = true)
    Integer updateFlag(String ip,Integer port,Integer flag,String useTime);
}
