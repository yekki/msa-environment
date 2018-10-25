package me.yekki.springcloud.env.test.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

@Data
public class ResultVO<T> {

    private T data;
    private int code;
    private String message;

    public static ResultVO success(Object object) {

        return getInstance(object, 0, "success");
    }

    public static ResultVO fail(String message) {

        return getInstance(null, -1, message);
    }

    private static ResultVO getInstance(Object object, int code, String message) {
        ResultVO vo = new ResultVO();
        vo.setData(object);
        vo.setCode(code);
        vo.setMessage(message);

        return vo;
    }

}
