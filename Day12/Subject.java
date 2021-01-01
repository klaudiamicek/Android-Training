package com.more.classes;

public class Subject {
    private String subjectCode;
    private String subjectName;

    //constructor that accepts subject code, subject name
    public Subject(String subjectCode, String subjectName)
    {
        //this keyword refers to object being constructed
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
    }
    //copy constructor
    public Subject (Subject subject)
    {
        this.subjectCode = subject.subjectCode;
        this.subjectName = subject.subjectName;
    }

    public boolean equals(Subject object)
    {
        return (this.subjectName.equals(object.subjectName) &&
        this.subjectCode.equals(object.subjectCode));

    }

    public String getSubjectCode()
    {
        return subjectCode;
    }

    public void setSubjectCode (String subjectCode)
    {
        this.subjectCode = subjectCode;
    }

    public void setSubjectName(String subjectName)
    {
        this.subjectName = subjectName;
    }

    @Override
    public String toString()
    {
        return "Subject information:\n" +
                "Subject code: " + subjectCode + "\n" +
                "Subject name: " + subjectName;
    }



}
