package com.igeek.admin.model.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhouxu
 * @email 1419982188@qq.com
 * @date 2020/04/10
 */
@Data
@Builder(toBuilder = true)
public class Users implements Serializable {

    private Long id;

    private String account;

    private String mobile;

    private String email;

    private String password;

    private String nickname;

    private String sex;

    private String headImage;

    private Date createTime;

    private Date updateTime;

    private Date lastLoginTime;

    private Integer loginCount;

    private Boolean locked;

    private Boolean login;
}