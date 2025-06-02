package com.gentrit;

import com.gentrit.config.AppConfiguration;
import com.gentrit.consoleView.ConsoleMenu;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

        ConsoleMenu program = context.getBean(ConsoleMenu.class);

        program.startProgram();

    }
}