package com.tech2java.java8.methodref;

public class Employee {
    private String name;
    private String  mobileNo;

    public Employee(String name, String mobileNo) {
        this.name = name;
        this.mobileNo = mobileNo;
    }

    //Testing
    /*public Employee(String name) {
        this.name = name;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
}
