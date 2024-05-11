package com.tech2java.java7examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceExample {

    public static void main(String[] args) throws Exception {

        beforejava7();
        withjava7();
    }

    private static void beforejava7() throws IOException {
        //Read the file data and print t on console
        BufferedReader br=null;
        try{

            br=new BufferedReader(new FileReader("E://test.txt"));
            String line=br.readLine();
            while(line!=null){
                System.out.println(line);
                line=br.readLine();

            }
        }catch(Exception exception){
            exception.printStackTrace();
        }finally{

            if(br!=null){
                br.close();
            }
        }
    }

    private static void withjava7() throws Exception {
        try(CustomResource cr=new CustomResource();){
            cr.readDate();
        }
    }
}
