package net.xdclass.online_xdclass.service;

import net.xdclass.online_xdclass.model.entity.Chapter;

import java.util.List;

public interface ChapterService {
    List<Chapter> selectChapterByVideoId(int video_id);
}
