package me.yekki.springcloud.env.test.service;

import me.yekki.springcloud.env.test.vo.ResultVO;
import me.yekki.springcloud.env.test.vo.UserVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "msa-user-provider", fallback = UserHystrixClientCallback.class)
public interface UserHystrixClient {

    @GetMapping("/users")
    ResultVO<List<UserVO>> getUsers();
}
