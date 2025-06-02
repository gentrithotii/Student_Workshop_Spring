package com.gentrit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

@Configuration
@ComponentScan("com.gentrit.*")
public class AppConfiguration {
    // register and config all beans and components
    @Bean
    public Scanner scanner() {
        return new Scanner(System.in);
    }
}
