package com.chen.autoport;

import com.chen.autoport.service.impl.AsyncTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutoportApplication {


    public static void main(String[] args) {
        SpringApplication.run(AutoportApplication.class, args);
    }

}
