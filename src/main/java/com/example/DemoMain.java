package com.example;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
public class DemoMain {
    public static void main(String[] args) {
        System.out.println("======Before Out from Main=========");
        SpringApplication.run(DemoMain.class, args);
        System.out.println("======After Out from Main=========");
    }
}
