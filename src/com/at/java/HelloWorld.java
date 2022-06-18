package com.at.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

public class HelloWorld {
    public HelloWorld() {
    }

    private static final int INITIAL_SIZE = 10;

    //这是单行注释
    //    1231
    public static void main(String[] agrs) {
        System.out.println("helloworld!!");
        ArrayList list = new ArrayList();
        Date date = new Date();

        list.add('1');

    }

    public static void run(){
        try {
            FileInputStream fis = new FileInputStream("123.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}

