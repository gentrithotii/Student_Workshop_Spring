package com.gentrit;

import com.gentrit.config.AppConfiguration;
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

        StudentDao studentDao = context.getBean(StudentDao.class);
        UserInputService userInputService = context.getBean(UserInputService.class);
        StudentManagement studentManagement = context.getBean(StudentManagement.class);

        for (int i = 0; i < 2; i++) {
            studentManagement.save(studentManagement.create());
        }

        System.out.println(studentManagement.findAll());

        studentManagement.edit(new Student(1, "Testi"));

        System.out.println(studentManagement.findAll());

    }
}