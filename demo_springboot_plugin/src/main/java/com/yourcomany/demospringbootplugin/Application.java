package com.yourcomany.demospringbootplugin;

import info.xiancloud.plugin.init.IStartService;
import info.xiancloud.plugin.util.EnvUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * springboot程序入口
 * Created by happyyangyuan at 2018/1/26
 */
@SpringBootApplication
@EnableSwagger2
public class Application implements IStartService {

    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", EnvUtil.getShortEnvName());
        SpringApplication.run(Application.class, args);
    }

    @Override
    public boolean startup() {
        Application.main(new String[0]);
        return true;
    }
}
