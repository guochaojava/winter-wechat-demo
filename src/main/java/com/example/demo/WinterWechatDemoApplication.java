package com.example.demo;

import com.lgd.winter.wechat.config.BaseConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class WinterWechatDemoApplication {

    @Bean
    public BaseConfig baseConfig() {
        BaseConfig baseConfig = new BaseConfig("wxb22641dd853c4fdf", "d3a79d6c62c468d9d25b665b26500b5a");
        return baseConfig;
    }

    public static void main(String[] args) {
        SpringApplication.run(WinterWechatDemoApplication.class, args);
    }
}
