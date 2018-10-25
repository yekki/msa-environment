package me.yekki.springcloud.env.test.service;

import me.yekki.springcloud.env.test.vo.UserVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("msa-user-provider")
@Service
public interface UserService {

    @GetMapping("/users")
    public List<UserVO> getUsers();
}
