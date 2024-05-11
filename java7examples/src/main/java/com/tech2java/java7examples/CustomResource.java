package com.tech2java.java7examples;

public class CustomResource implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("Closing the resource...");
    }

    public void readDate(){
        System.out.println("Reading data from a file....");
    }



}
