package jp.baseManagement;

/**
 * Created by 3111266 on 2016/09/02.
 * jp.baseManagement
 */

import org.mybatis.spring.annotation.MapperScan;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("jp.baseManagement.domain.mapper")
public class baseApplication {
    public static void main(String[] args) {
        SpringApplication.run(baseApplication.class, args);
    }




}
