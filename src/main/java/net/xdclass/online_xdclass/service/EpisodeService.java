package net.xdclass.online_xdclass.service;

import net.xdclass.online_xdclass.model.entity.Episode;

import java.util.List;

public interface EpisodeService {
    /**
     * 根据 chapter_id 映射到 Chapter 类
     * @param chapterId
     * @return
     */
    List<Episode> selectByVideoChapterId(int chapterId);
}
