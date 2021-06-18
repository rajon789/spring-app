package com.t24.middleware.t24middleware.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student rafa = new Student("Rafa","rafa@gmail.com", LocalDate.of(2013, JANUARY, 7));
            Student zeesun = new Student("Zeesun","zeesun@gmail.com",LocalDate.of(2010, OCTOBER, 7));

            repository.saveAll(
                    List.of(rafa,zeesun)
            );
        };
    }
}
