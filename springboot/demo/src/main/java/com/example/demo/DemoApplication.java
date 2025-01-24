package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.blueeye.BlueEyeWhiteDragon;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.demo.blueeye")  // Quét thêm package con nơi chứa BlueEyeWhiteDragon
public class DemoApplication {
    public static void main(String[] args) {
        // Khởi động Spring Boot
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        
        // Gọi Bean
        BlueEyeWhiteDragon blueEyeWhiteDragon = context.getBean(BlueEyeWhiteDragon.class);
        
        // Hiển thị Bean
        System.out.println("Bean Dragon: " + blueEyeWhiteDragon);
        
        // Gọi phương thức
        blueEyeWhiteDragon.Attack();
    }
}
