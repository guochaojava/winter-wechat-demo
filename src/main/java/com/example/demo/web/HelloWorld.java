package com.example.demo.web;

import com.lgd.winter.wechat.core.WeChatTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date: 2018/3/15
 * @Time: 17:36
 * @Author GuoChao.
 * @Description: TODO
 */
@RestController
public class HelloWorld {

    @Autowired
    private WeChatTemplate weChatTemplate;

    @GetMapping("/accessToken")
    public String hello() {
        return weChatTemplate.getAccessToken();
    }

    @PostMapping("/userInfo")
    public String userInfo(String accessToken, String openId) {
        return weChatTemplate.getUserInfo(accessToken, openId);
    }

}