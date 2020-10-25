package net.xdclass.online_xdclass.model.request;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.annotation.Resource;

@Data
public class VideoOrderRequest {
    @JsonProperty("video_id")
    private int VideoId;
}
