package com.itheima.reggie;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Slf4j
@SpringBootApplication
@ServletComponentScan // 自动扫描webFilter
@EnableTransactionManagement // 开启事务
public class ReggieMasterApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReggieMasterApplication.class, args);
        log.info("项目加载成功");
    }
}

