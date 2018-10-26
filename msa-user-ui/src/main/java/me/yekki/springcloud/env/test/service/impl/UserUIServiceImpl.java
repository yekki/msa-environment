package me.yekki.springcloud.env.test.service.impl;

import lombok.extern.slf4j.Slf4j;
import me.yekki.springcloud.env.test.service.UserUIService;
import me.yekki.springcloud.env.test.vo.ResultVO;
import me.yekki.springcloud.env.test.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@Service
@Slf4j
public class UserUIServiceImpl implements UserUIService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<UserVO> getUsers() {

        ResultVO<List<UserVO>> resp = restTemplate.getForObject("http://msa-user-provider/users", ResultVO.class);

        if (resp.getCode() != -1) {

            return resp.getData();
        } else {
            log.error(resp.getMessage());
            return Collections.emptyList();
        }
    }
}
