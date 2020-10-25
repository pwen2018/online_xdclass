package net.xdclass.online_xdclass.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户信息
 * `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
 * `name` varchar(128) DEFAULT NULL COMMENT '昵称',
 * `pwd` varchar(124) DEFAULT NULL COMMENT '密码',
 * `head_img` varchar(524) DEFAULT NULL COMMENT '头像',
 * `phone` varchar(64) DEFAULT '' COMMENT '手机号',
 * `create_time` datetime DEFAULT NULL COMMENT '创建时间',
 */
@Data
public class User implements Serializable {
    private Integer id;
    private String name;
    @JsonIgnore
    private String pwd;
    private String headImg;
    private String phone;
    private Date createTime;

}
