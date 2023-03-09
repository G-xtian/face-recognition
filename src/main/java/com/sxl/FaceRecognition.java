package com.sxl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@MapperScan("com.sxl.mapper")
@SpringBootApplication
@EnableSwagger2
public class FaceRecognition {
    public static void main(String[] args) {
        SpringApplication.run(FaceRecognition.class,args);
    }
}
