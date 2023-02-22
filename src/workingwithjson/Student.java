package workingwithjson;

/* 
Project: Lab 6
Purpose Details: Working with JSON
Course: IST 411
Author: AJ Germani
Date Developed: 2/21/2023
Last Date Changed: 2/22/2023
Revision: 1
*/
public class Student {

    private String lName;
    private double GPA;
    private int currentCredits;
    private int totalCredits;
    private String fName;

    // Empty constructor required for object mapping in JsonUtil class
    public Student() {

    }

    // Student constructor
    public Student(String lName, double GPA, int currentCredits, int totalCredits, String fName) {
        this.lName = lName;
        this.GPA = GPA;
        this.currentCredits = currentCredits;
        this.totalCredits = totalCredits;
        this.fName = fName;
    }

    /**
     * Custom toString for Student object
     * @return string representation of Student object
     */
    @Override
    public String toString() {
        StringBuilder stringB = new StringBuilder();
        stringB
                .append("Student First Name: ").append(this.fName).append("\n")
                .append("Student Last Name: ").append(this.lName).append("\n")
                .append("Student GPA: ").append(this.GPA).append("\n")
                .append("Current Credits: ").append(this.currentCredits).append("\n")
                .append("Total Credits: ").append(this.totalCredits).append("\n");

        return stringB.toString();
    }

    // Getters & Setters for Student properties
    // Required for object mapping in JsonUtil class
    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public int getCurrentCredits() {
        return currentCredits;
    }

    public void setCurrentCredits(int currentCredits) {
        this.currentCredits = currentCredits;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }
    
    
}
