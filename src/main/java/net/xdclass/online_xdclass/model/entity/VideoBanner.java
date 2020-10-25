package net.xdclass.online_xdclass.model.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 视频轮播图
 * `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
 * `url` varchar(256) DEFAULT NULL COMMENT '跳转地址',
 * `img` varchar(256) DEFAULT NULL COMMENT '图片地址',
 * `create_time` datetime DEFAULT NULL,
 * `weight` int(11) DEFAULT NULL COMMENT '数字越小排越前',
 */
@Data
public class VideoBanner implements Serializable {
    private Integer id;
    private String url;
    private String img;
    private String createTime;
    private Integer weight;
}
