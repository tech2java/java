package com.tech2java.java7examples;

public class CustomDummyResource implements AutoCloseable{


    @Override
    public void close() throws Exception {
        throw new NullPointerException("NullPointerException occured.....");

    }

    public void readFromFile(){
        throw new RuntimeException("RuntimeException due to network error...");
    }
}
