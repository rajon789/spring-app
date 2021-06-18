package com.t24.middleware.t24middleware;

import com.t24.middleware.t24middleware.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class T24MiddlewareApplication {

    public static void main(String[] args) {

        SpringApplication.run(T24MiddlewareApplication.class, args);
    }
}
