package com.gentrit;

import com.gentrit.config.AppConfiguration;
import com.gentrit.consoleView.ConsoleMenu;
import com.gentrit.data_access.StudentDao;
import com.gentrit.models.Student;
import com.gentrit.service.StudentManagement;
import com.gentrit.service.impl.StudentManagementConsoleImpl;
import com.gentrit.util.ScannerInputService;
import com.gentrit.util.UserInputService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

        ConsoleMenu program = context.getBean(ConsoleMenu.class);

        program.startProgram();

    }
}