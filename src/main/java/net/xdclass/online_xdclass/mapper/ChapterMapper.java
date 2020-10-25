package net.xdclass.online_xdclass.mapper;

import net.xdclass.online_xdclass.model.entity.Chapter;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChapterMapper {
    /**
     * 根据视频ID查询视频
     * private Integer id;
     *     private Integer videoId;
     *     private String title;
     *     private Integer ordered;
     *     private Date createTime;
     *     private List<Episode> episodeList;
     */
    @Select("select * from chapter where video_id = #{video_id}")
    @Results(id = "ChapterMapper",
            value = {
                    @Result(id = true, property = "id", column = "id"),
                    @Result(property = "video_id", column = "videoId"),
                    @Result(property = "title", column = "title"),
                    @Result(property = "ordered", column = "ordered"),
                    @Result(property = "create_time", column = "createTime"),
                    @Result(property = "episodeList", column = "id",
                        one = @One(
                                select = "net.xdclass.online_xdclass.mapper.EpisodeMapper.selectByVideoChapterId",
                                fetchType = FetchType.EAGER
                        )
                    )
            }
    )
    List<Chapter> selectChapterByVideoId(int video_id);
}
