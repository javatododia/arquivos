package com.javatododia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {

        try {
            String s = "/tmp/f.txt"
            BufferedReader bf = new BufferedReader(new FileReader(new File(s)));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
