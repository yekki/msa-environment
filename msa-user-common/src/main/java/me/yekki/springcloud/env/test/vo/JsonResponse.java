package me.yekki.springcloud.env.test.vo;

import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
public class JsonResponse<T> {

    public static enum STATUS {
        OK,
        ERROR
    }

    public JsonResponse() {
        this.description = "";
    }

    public static JsonResponse ok() {
        JsonResponse response = new JsonResponse();
        response.setStatus(STATUS.OK);
        return response;
    }

    public static JsonResponse error() {
        JsonResponse response = new JsonResponse();
        response.setStatus(STATUS.ERROR);
        return response;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public void setData(T data) {
        this.data = Arrays.asList(data);
    }

    private List<T> data;
    private STATUS status;
    private String description;
}
