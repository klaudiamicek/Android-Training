package com.more.classes;

public class ExamPaper {
    //aggregation, three fields
    private Student student;
    private Subject subject;
    private int marks;

    //constructor
    public ExamPaper(Student student, Subject subject, int marks) {
        //using copy constructor to make copy of passed variable
        this.student = new Student(student);
        this.subject = new Subject(subject);
        this.marks = marks;
    }
    //getters
    public Student getStudent() {
        //copy of student object
        return new Student(student);
    }


    public Subject getSubject() {
        return new Subject(subject);
    }

    //setters
    public void setStudent(Student student) {
        this.student = new Student(student);
    }

    public void setSubject(Subject subject) {
        this.subject = new Subject(subject);
    }

    public int getMarks() {
        return marks;
    }

    //overriding toString to return information
    @Override
    public String toString()
    {
        return "Exam paper information:\n" +
                student + "\n" + subject + "\n" +
                "Marks: " + marks;
    }

}
