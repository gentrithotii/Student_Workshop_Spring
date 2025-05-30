package com.gentrit.consoleView;

import com.gentrit.models.Student;
import com.gentrit.service.StudentManagement;
import com.gentrit.util.ConsoleColor;
import com.gentrit.util.UserInputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConsoleMenu {
    private final StudentManagement studentManagement;
    private final UserInputService userInputService;
    private boolean menuLoop;

    @Autowired
    public ConsoleMenu(StudentManagement studentManagement, UserInputService userInputService) {
        this.studentManagement = studentManagement;
        this.userInputService = userInputService;
        this.menuLoop = true;
    }

    public UserInputService getUserInputService() {
        return userInputService;
    }

    public StudentManagement getStudentManagement() {
        return studentManagement;
    }

    private void menuChoicesText() {
        System.out.println("1. Create a student");
        System.out.println("2. Find student by id");
        System.out.println("3. Get all students");
        System.out.println("4. Edit a student");
        System.out.println("0. Exit");
    }

    private Student editStudent() {
        System.out.print("Enter the student id you want to update ");
        int idToFind = getUserInputService().getInt();
        System.out.print("Enter the name you want to update the student to");
        String editStudentName = getUserInputService().getString();

        Student studentToUpdate = new Student(idToFind, editStudentName);

        return studentToUpdate;
    }

    private int findByIdChoice() {
        System.out.println("Enter the id of the student you want to find");
        int idToFind = getUserInputService().getInt();

        return idToFind;
    }

    public void startProgram() {
        while (menuLoop) {
            menuChoicesText();
            menuChoicesOperation();
        }
    }

    private void menuChoicesOperation() {
        try {
            System.out.print("Pick a choice: ");
            int menuChoice = getUserInputService().getInt();

            switch (menuChoice) {
                case 1:
                    try {
                        Student createdStudent = getStudentManagement().save(getStudentManagement().create());
                        System.out.println(ConsoleColor.ANSI_GREEN +  "Student: " + createdStudent + "has been created" + ConsoleColor.ANSI_RESET);

                    } catch (NumberFormatException e) {
                        System.err.println("Id cant be letters !");
                    } catch (IllegalArgumentException e) {
                        System.err.println("Error creating student");
                    }
                    break;
                case 2:
                    Student byIdStudent = getStudentManagement().findById(findByIdChoice());
                    System.out.println(ConsoleColor.ANSI_GREEN + "Found: " + byIdStudent + ConsoleColor.ANSI_RESET);
                    break;
                case 3:
                    System.out.println(getStudentManagement().findAll());
                    break;
                case 4:
                    getStudentManagement().edit(editStudent());
                    break;
                case 0:
                    menuLoop = false;
                    break;
                default:
                    System.out.println(ConsoleColor.ANSI_RED + "Wrong choice" + ConsoleColor.ANSI_RESET);
            }
        } catch (NumberFormatException e) {
            System.err.println("Invalid input ! only takes numbers from 1 to 4 and 0 to exit");
        }

    }
}
