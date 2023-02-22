package workingwithjson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Project: Lab 6
Purpose Details: Working with JSON
Course: IST 411
Author: AJ Germani
Date Developed: 2/21/2023
Last Date Changed: 2/22/2023
Revision: 1
*/
public class JsonUtil {

    public List getStudentList() {
        // Instantiate scanner object for user input
        Scanner scr = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        
        // Use a loop to gather student information for three students
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter Student First Name: ");
            String fName = scr.nextLine();
            System.out.println("Enter Student Last Name: ");
            String lName = scr.nextLine();
            System.out.println("Enter Student GPA: ");
            double GPA = Double.parseDouble(scr.nextLine());
            System.out.println("Enter Current Credits: ");
            int currentCredits = Integer.parseInt(scr.nextLine());
            System.out.println("Enter Total Credits: ");
            int totalCredits = Integer.parseInt(scr.nextLine());

            studentList.add(new Student(lName, GPA, currentCredits, totalCredits,
                    fName));
        }
        return studentList;
    }

    public void objToJSON() {
        List<Student> studentList = getStudentList();
        
        // Create a new ObjectMapper to map Java object to
        ObjectMapper objectMapper = new ObjectMapper();
        // Map values of studentList with objectMapper and convert to JSON
        // Write data to .json file
        try {
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("Students.json"), studentList);
        } catch (IOException ex) {
            System.out.println(ex);
        }

    }

    public void displayJSON() {
        // Create a new ObjectMapper to map JSON object to
        ObjectMapper objectMapper = new ObjectMapper();
        // Construct a CollectionType, assigning it the List and Student types
        CollectionType collectionType = objectMapper.getTypeFactory()
                .constructCollectionType(List.class, Student.class);
        
        List<Student> studentList = new ArrayList<>();
        
        // Read .json file and map values to studentList
        try {
            studentList = objectMapper.readValue(new File("Students.json"), collectionType);
        } catch (IOException ex) {
            System.out.println(ex);
        }

        // Print data from all student objects in the list to the terminal
        if (!studentList.isEmpty()) {
            for (Student student : studentList) {
                System.out.println(student.toString());
            }
        }
        else{
            System.out.println("List is empty!");
        }
    }
}
