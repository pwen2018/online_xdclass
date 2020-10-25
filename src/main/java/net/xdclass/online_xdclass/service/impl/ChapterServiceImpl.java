package net.xdclass.online_xdclass.service.impl;

import net.xdclass.online_xdclass.model.entity.Chapter;
import net.xdclass.online_xdclass.mapper.ChapterMapper;
import net.xdclass.online_xdclass.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChapterServiceImpl implements ChapterService {

    @Autowired
    private ChapterMapper chapterMapper;

    @Override
    public List<Chapter> selectChapterByVideoId(int video_id) {
        return chapterMapper.selectChapterByVideoId(video_id);
    }
}
