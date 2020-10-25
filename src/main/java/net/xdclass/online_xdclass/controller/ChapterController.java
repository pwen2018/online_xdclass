package net.xdclass.online_xdclass.controller;


import net.xdclass.online_xdclass.model.entity.Chapter;
import net.xdclass.online_xdclass.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/pub/chapter")
public class ChapterController {
    @Autowired
    private ChapterService chapterService;


    @GetMapping("test")
    public List<Chapter> selectChapterByVideoId(@RequestParam(value = "video_id") int videoId) {
        return chapterService.selectChapterByVideoId(videoId);
    }
}
