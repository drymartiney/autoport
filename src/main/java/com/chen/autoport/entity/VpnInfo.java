package com.chen.autoport.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Anthor: chen
 * Date: 2020/3/28
 * Time: 11:05
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VpnInfo {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    private String ip;

    private Integer port;

    private String type;

    private Integer flag;

    private String useTime;
}
