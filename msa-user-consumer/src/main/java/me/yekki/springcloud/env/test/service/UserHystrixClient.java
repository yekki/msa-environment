package me.yekki.springcloud.env.test.service;

import me.yekki.springcloud.env.test.vo.JsonResponse;
import me.yekki.springcloud.env.test.vo.UserVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "msa-user-provider", fallback = UserHystrixClientCallback.class)
public interface UserHystrixClient {

    @GetMapping("/users")
    JsonResponse<UserVO> getUsers();

}
