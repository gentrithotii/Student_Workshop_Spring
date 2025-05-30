package com.gentrit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Objects;
import java.util.Scanner;

@Configuration
public class ScannerConfig {

    @Bean
    public Scanner getScanner() {
        return new Scanner(System.in);
    }
}
