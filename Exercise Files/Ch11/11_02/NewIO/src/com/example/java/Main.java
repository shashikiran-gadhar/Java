package com.example.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {

    public static void main(String[] args) {

        Path srcFile = Paths.get("files", "loremipsum.txt");
        Path trgFile = Paths.get("files", "target.txt");

        try
        {
            Files.copy(srcFile, trgFile, StandardCopyOption.REPLACE_EXISTING);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


    }

}
