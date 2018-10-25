package me.yekki.springcloud.env.test.service;

import me.yekki.springcloud.env.test.vo.ResultVO;
import me.yekki.springcloud.env.test.vo.UserVO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserHystrixClientCallback implements UserHystrixClient {

    @Override
    public ResultVO<List<UserVO>> getUsers() {

        return ResultVO.fail("Failed to get users from msa-user-provider service.");
    }
}
