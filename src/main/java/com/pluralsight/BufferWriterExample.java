package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterExample {

    public static void main(String[] args) {

        try {
            // create a FileWriter
            FileWriter fileWriter = new FileWriter("text.txt", true);
            // create a BufferedWriter
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            // write to the file

            bufferedWriter.write("Line 1 is here\n");
            bufferedWriter.write("Line 2 is here\n");
            bufferedWriter.write("Line 3 is here\n");

        // close the writer
             bufferedWriter.close();
        }catch (IOException e) {
            System.out.println("ERROR: An unexpected error occurred");
            e.getStackTrace();
        }
    }
}
