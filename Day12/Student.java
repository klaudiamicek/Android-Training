package com.more.classes;

public class Student {
    private String studentName;
    private long studentNumber;

    //creating constructor with both variables as parameters
    public Student(String studentName, long studentNumber)
    {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
    }

    //copy constructor accepting object Student
    public Student (Student student)
    {
        this.studentName = student.studentName;
        this.studentNumber = student.studentNumber;
    }

    //returns boolean and accepts Student object
    public boolean equals(Student object)
    {
        return (this.studentNumber == object.studentNumber &&
                this.studentName.equals(object.studentName));
    }
//getter
    public String getStudentName() {
        return studentName;
    }
//setter
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    public long getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(long studentNumber) {
        this.studentNumber = studentNumber;
    }
    //overriding toString to return information
    @Override
    public String toString()
    {
        return "Student information:\n" +
                "Student name: " + studentName + "\n" +
                "Student number: " + studentNumber;
    }


}
