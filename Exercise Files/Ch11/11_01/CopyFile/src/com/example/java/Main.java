package com.example.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {

        String srcFile = "files/loremipsum.txt";
        String trgFile = "files/target.txt";

        try(
                FileReader fReader = new FileReader(srcFile);
                BufferedReader bReader = new BufferedReader(fReader);
                FileWriter writer = new FileWriter(trgFile)
                )
        {
            while (true)
            {
                String line = bReader.readLine();
                if(line == null)
                    break;
                else
                    writer.write(line + "\n");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

}
