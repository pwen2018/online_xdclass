package net.xdclass.online_xdclass.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JsonData {
    // 状态码 0表示成功 1表示处理中 -1表示失败
    private Integer code;
    // 业务数据
    private Object data;
    // 信息描述
    private String msg;

    /**
     * 成功不用返回数据
     * @return
     */
    public static JsonData buildSuccess() {
        return new JsonData(0, null, null);
    }
    /**
     * 成功返回数据
     * @param object
     * @return
     */
    public static JsonData buildSuccess(Object object) {
        return new JsonData(0, object, null);
    }

    /**
     * 失败固定状态码
     * @param msg
     * @return
     */
    public static JsonData buildError(String msg) {
        return new JsonData(-1, null, msg);
    }

    /**
     * 失败自定义错误码和信息
     * @param code
     * @param msg
     * @return
     */
    public static JsonData buildError(Integer code, String msg) {
        return new JsonData(code, null, msg);
    }

}
