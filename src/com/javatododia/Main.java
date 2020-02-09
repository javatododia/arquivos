package com.javatododia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {

        try {
            String s = "/tmp/f.txt";
            BufferedReader br = new BufferedReader(new FileReader(new File(s)));

            String line;
            while((line=br.readLine())!=null) {
                System.out.println(line);
            }
            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
