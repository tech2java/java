package com.tech2java.java8.defaultmethods;

import java.lang.constant.Constable;

public interface DefaultMethodsInterf {

    //by default public
    default int sum(int x,int y){
        return x+y;
    }

    //Can't override Object class methods as default methods

    //Compiletime Error:Default method 'toString' overrides a member of 'java.lang.Object'
    /*
    default String toString(){
      return "Hello";
    }
    */

}
