package net.xdclass.online_xdclass.service.impl;

import net.xdclass.online_xdclass.model.entity.Episode;
import net.xdclass.online_xdclass.service.EpisodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EpisodeServiceImpl implements EpisodeService {

    @Autowired
    private EpisodeService episodeService;

    @Override
    public List<Episode> selectByVideoChapterId(int chapterId) {
        return episodeService.selectByVideoChapterId(chapterId);
    }
}
