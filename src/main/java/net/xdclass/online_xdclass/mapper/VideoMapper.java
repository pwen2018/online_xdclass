package net.xdclass.online_xdclass.mapper;

import net.xdclass.online_xdclass.model.entity.Video;
import net.xdclass.online_xdclass.model.entity.VideoBanner;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoMapper {
    /**
     * 查询全部视频列表
     */
    @Select("select * from video")
    List<Video> listVideo();

    /**
     * 首页轮播图列表
     *
     * @return
     */
    @Select("select * from video_banner order by weight asc")
    List<VideoBanner> listVideoBanner();

    /**
     * 多表查询
     * 配置主键
     * property: 多方维护的一方的那个对象
     * column: "id" 多方通过这个字段跟一方产生关联
     * fetchType : 加载模式
     * 一对一关系 : 一般选用立即加载 FetchType.EAGER
     * 一对多关系 : 一般选用延迟加载 FetchType.LAZY
     */
    @Select("select * from video where id = #{id}")
    @Results(id = "videoMapper",
            value = {
                    @Result(id = true, property = "id", column = "id"),
                    @Result(property = "title", column = "title"),
                    @Result(property = "summary", column = "summary"),
                    @Result(property = "cover_img", column = "coverImg"),
                    @Result(property = "price", column = "price"),
                    @Result(property = "point", column = "point"),
                    @Result(property = "create_time", column = "createTime"),
                    // id == video_id
                    @Result(property = "chapterList", column = "id",
                            one = @One(
                                    // 查询依据
                                    select = "net.xdclass.online_xdclass.mapper.ChapterMapper.selectChapterByVideoId",
                                    fetchType = FetchType.EAGER // 加载模式

                            )),
            })
    List<Video> findDetailById(int videoId);


}
