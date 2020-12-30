package com.example.textfiles;

import java.io.IOException;
import java.io.PrintWriter;

public class WritingtoFiles {
    public static void main(String[] args) throws IOException {
        //creates and opens file and if it exists, replaces file
        PrintWriter outputFile = new PrintWriter ("OutputFile.txt");

        //writes to files using object
        outputFile.println("This is line 1");
        outputFile.println("This is line 2");
        outputFile.println("This is line 3");

        //to close file
        outputFile.close();
    }
}
