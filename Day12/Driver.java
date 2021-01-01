package com.more.classes;

public class Driver {

    public static void main(String[] args) {
        //creates Subject object
        Subject subject1 = new Subject("TPG10AB", "Technical Programming 1" );

        Student student1 = new Student("Chuck Norris", 123810928);

        //new ExamPaper with passed parameters
        ExamPaper paper = new ExamPaper(student1, subject1, 100);

        System.out.println("Subject code: " + paper.getSubject().getSubjectCode());
        System.out.println("Student number: " + paper.getStudent().getStudentNumber());

    }
}
