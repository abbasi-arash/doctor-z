package com.firstsource.doctor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DoctorApplication {
    private static final Logger log = LoggerFactory.getLogger(DoctorApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DoctorApplication.class, args);
    }
}
