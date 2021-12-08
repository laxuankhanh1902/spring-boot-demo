package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            var khanh = new Student(1L, "Khanh", "khanh@gmail.com", LocalDate.of(1998, Month.JANUARY, 22));
            var kim = new Student(2L, "Kim", "kim@gmail.com", LocalDate.of(1996, Month.FEBRUARY, 13));

            studentRepository.saveAll(List.of(khanh, kim));
        };
    }
}
