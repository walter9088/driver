package com.br;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by walter on 17/9/30.
 */

@EnableAutoConfiguration
@SpringBootApplication
@MapperScan({"com.br.staff.dao.mapper","com.br.svn.dao.mapper"})
public class DriverApplication {

    public static void main(String[] args) throws Exception {

        SpringApplication.run(DriverApplication.class, args);

    }
}
