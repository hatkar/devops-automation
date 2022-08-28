package com.hatmani.devopsintegrationcicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/devops")
@SpringBootApplication
public class DevopsintegrationcicdApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevopsintegrationcicdApplication.class, args);
    }

    @GetMapping("/")
    public String index() {
        return "Bonjours Projet DevOps CICD with Jenkins";
    }
}
