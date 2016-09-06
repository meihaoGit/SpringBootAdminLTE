package jp.baseManagement;

/**
 * Created by 3111266 on 2016/09/02.
 * jp.baseManagement
 */

import jp.baseManagement.domain.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class baseApplication implements CommandLineRunner {
    @Autowired
    private UserMapper mapper;

    public static void main(String[] args) {
        SpringApplication.run(baseApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(this.mapper.selectUserById("admin"));
    }

}
