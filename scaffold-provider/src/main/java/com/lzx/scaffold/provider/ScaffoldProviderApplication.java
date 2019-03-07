package com.lzx.scaffold.provider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@MapperScan(basePackages = "com.lzx.scaffold.provider.mapper")
@SpringBootApplication
public class ScaffoldProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScaffoldProviderApplication.class, args);
    }

}
