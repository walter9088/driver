package com.br;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by walter on 17/9/30.
 */

@EnableAutoConfiguration
@SpringBootApplication
public class DriverApplication {

    public static void main(String[] args){
        SpringApplication.run(DriverApplication.class,args);

    }
}
