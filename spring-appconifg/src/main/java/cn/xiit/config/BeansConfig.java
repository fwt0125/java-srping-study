package cn.xiit.config;

import cn.xiit.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public User getUser(){
        return new User();
    }
}
