package com.tech2java.java7examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SafeArgExample {

    public static void main(String[] args) {


        sum(1);
        sum(1,2);
        sum(1,2,3,4);

        List<String> list1=new ArrayList<>();
        List<String> list2=new ArrayList<>();
        List<String> list3=new ArrayList<>();

        list1.add("java");
        list2.add("spring");
        list3.add("microservices");

        SafeArgExample safeArgExample=new SafeArgExample();
        safeArgExample.print(list1,list2,list3);

    }

    //Check the warning section -
    //by default it shows heap pollution message is we use below var args method.
    @SafeVarargs
    public final void print(List<String>... messages){

       /*
        Object[] obj=messages;
        List<Integer> list4=new ArrayList<>();
        list4.add(45);

        obj[0]=list4;

        //java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String
        //Heap is getting polluted as Object[] is having both integers and strings

        //Possible heap pollution from parameterized vararg type
        String firstElement=messages[0].get(0);
        */
        String firstElement=messages[0].get(0);
        System.out.println(firstElement);

    }

    private static void sum(int... nums){

        System.out.println(Arrays.toString(nums));
        int total=0;
        for(int num:nums){
            total+=num;
        }
        System.out.println(total);
    }
}
