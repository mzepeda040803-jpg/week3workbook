package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class BufferedReaderExample {


    public static void main(String[] args) {
        try {
// create a FileReader object connected to the File
            FileReader fileReader = new FileReader("poem.txt");
// create a BufferedReader to manage input stream
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String input;
// read until there is no more data
            while((input = bufferedReader.readLine()) != null) {
                System.out.println(input);
            }
// close the stream and release the resources
            bufferedReader.close();
        }catch(IOException e) {
// display stack trace if there was an error
            e.printStackTrace();
        }

    }










}
