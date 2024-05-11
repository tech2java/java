package com.tech2java.java7examples;

import java.util.ArrayList;
import java.util.List;

public class TypeInferenceExample {


    public static void main(String[] args) {

        //before java 7
        List<String> list=new ArrayList<String>();
        list.add(".net");

        //from java7
        List<String> list1=new ArrayList<>();
        list1.add("java");

        System.out.println(list);
        System.out.println(list1);












    }

}
