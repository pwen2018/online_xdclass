package net.xdclass.online_xdclass.model.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 集对象
 * `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
 * `title` varchar(524) DEFAULT NULL COMMENT '集标题',
 * `num` int(10) DEFAULT NULL COMMENT '第几集,全局顺序',
 * `ordered` int(11) DEFAULT NULL COMMENT '顺序，章里面的顺序',
 * `play_url` varchar(256) DEFAULT NULL COMMENT '播放地址',
 * `chapter_id` int(11) DEFAULT NULL COMMENT '章节主键id',
 * `free` tinyint(2) DEFAULT '0' COMMENT '0表示免费，1表示首付',
 * `video_id` int(10) DEFAULT NULL COMMENT '视频id',
 * `create_time` datetime DEFAULT NULL COMMENT '创建时间',
 */
@Data
public class Episode implements Serializable {
    private Integer id;
    private String title;
    private Integer num;
    private Integer ordered;
    private String playUrl;
    private Integer chapterId;
    private Integer free;
    private Integer videoId;
    private Date createTime;

}
