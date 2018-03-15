package com.example.demo.config;

import com.lgd.winter.wechat.config.BaseConfig;
import com.lgd.winter.wechat.core.WeChatTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Date: 2018/3/15
 * @Time: 17:34
 * @Author GuoChao.
 * @Description: TODO
 */
@Configuration
public class WeChatConfig {

    @Autowired
    private BaseConfig baseConfig;

    @Bean
    public WeChatTemplate weChatTemplate() {
        WeChatTemplate weChatTemplate = new WeChatTemplate(baseConfig);
        return weChatTemplate;
    }
}