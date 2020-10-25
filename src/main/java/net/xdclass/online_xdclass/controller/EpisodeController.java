package net.xdclass.online_xdclass.controller;

import net.xdclass.online_xdclass.mapper.EpisodeMapper;
import net.xdclass.online_xdclass.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/pub/episode")
public class EpisodeController {
    @Autowired
    private EpisodeMapper episodeMapper;

    @GetMapping("find_by_chapter_id")
    public JsonData selectByVideoChapterId(@RequestParam(value = "chapter_id", required = false)int chapterId) {
        return JsonData.buildSuccess(episodeMapper.selectByVideoChapterId(chapterId));
    }

}
