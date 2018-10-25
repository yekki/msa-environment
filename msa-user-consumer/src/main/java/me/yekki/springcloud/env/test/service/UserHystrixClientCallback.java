package me.yekki.springcloud.env.test.service;

import me.yekki.springcloud.env.test.vo.JsonResponse;
import me.yekki.springcloud.env.test.vo.UserVO;
import org.springframework.stereotype.Component;

@Component
public class UserHystrixClientCallback implements UserHystrixClient {

    @Override
    public JsonResponse<UserVO> getUsers() {

        JsonResponse resp = JsonResponse.error();
        resp.setDescription("error occurs");

        return resp;
    }
}
