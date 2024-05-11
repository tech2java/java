package com.tech2java.java7examples;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SuppressedExceptionExample {

    private static final Logger LOGGER=Logger.getLogger(SuppressedExceptionExample.class.toString());

    public static void main(String[] args) {
        //SEVERE: java.lang.NullPointerException: NullPointerException occured.....
        //RuntimeException is suppressed here-(getting in try block-Latest exception is printing
        try {
            beforeJava7();
        }catch(Exception exception){

            LOGGER.log(Level.SEVERE,exception.toString());
        }

        //With JAVA7
        try{
            withJava7();
        }catch(Exception ex){

            LOGGER.log(Level.SEVERE,ex.toString());//Prints RuntimeException

            final Throwable[] suppressedExceptions=ex.getSuppressed();

            if(suppressedExceptions.length>0){
                for(final Throwable throwable:suppressedExceptions){
                    LOGGER.log(Level.SEVERE,throwable.toString());//NullPointerException
                }
            }
        }
    }

    public static void beforeJava7() throws Exception {
        CustomDummyResource cr=null;
        try{
            cr=new CustomDummyResource();
            cr.readFromFile();
        }finally {
            cr.close();
        }
    }


    public static void withJava7() throws Exception {

        try(CustomDummyResource cr=new CustomDummyResource();){
            cr.readFromFile();
        }
    }

}

