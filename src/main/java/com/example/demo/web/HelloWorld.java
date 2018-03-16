package com.example.demo.web;

import com.lgd.winter.wechat.config.BaseConfig;
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
        return weChatTemplate.opsForTecent().getAccessToken();
    }

    @PostMapping("/userInfo")
    public String userInfo(String accessToken, String openId) {
        return weChatTemplate.opsForTecent().getUserInfo(accessToken, openId);
    }

    @GetMapping("/init/accessToken")
    public String init() {
        BaseConfig baseConfig = new BaseConfig("wxb22641dd853c4fdf","d3a79d6c62c468d9d25b665b26500b5a");
        WeChatTemplate template = new WeChatTemplate(baseConfig);
        return template.opsForTecent().getAccessToken();
    }
}