package com.example.demo.student;

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
            Student reda = new Student(
                    "reda",
                    "redwan@gmail.com",
                    LocalDate.of(2000, JANUARY, 6),
                    21
            );
            Student faycal = new Student(
                    "faycal",
                    "faycal@gmail.com",
                    LocalDate.of(1996, MARCH, 16),
                    25
            );
            repository.saveAll(
                    List.of(reda,faycal));
        };
    }
}
