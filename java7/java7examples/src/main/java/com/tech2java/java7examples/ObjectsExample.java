package com.tech2java.java7examples;

import java.util.Objects;

public class ObjectsExample {

    public static void main(String[] args) {

        Employee employee=null;
        processEmployeeDetails(employee);
    }

    private static void processEmployeeDetails(Employee employee){

        //Use it for debugging purpose
        Objects.requireNonNull(employee,"Employee Object can't be null");
        System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());
    }

}

class Employee{

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
