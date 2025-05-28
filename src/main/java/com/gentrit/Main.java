package com.gentrit;

import com.gentrit.config.AppConfiguration;
import com.gentrit.data_access.StudentDao;
import com.gentrit.models.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

        StudentDao studentDao = context.getBean(StudentDao.class);
    }
}