package cn.coget.bing.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author: sin
 * time: 2020/9/16 10:22 上午
 */
@RestController
@RefreshScope
public class ConfigController {

    @Value("${name:false}")
    private String name;

    @GetMapping("/config/name")
    public String name() {
        return name;
    }
}
