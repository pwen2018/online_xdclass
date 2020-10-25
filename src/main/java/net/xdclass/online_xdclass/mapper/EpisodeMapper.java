package net.xdclass.online_xdclass.mapper;

import net.xdclass.online_xdclass.model.entity.Episode;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EpisodeMapper {
    @Select("select * from episode where chapter_id = #{chapter_id}")
    List<Episode> selectByVideoChapterId(int chapterId);
}
