package com.lzx.scaffold.consumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableDubbo
@SpringBootApplication
public class ScaffoldConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScaffoldConsumerApplication.class, args);
	}

}
