package com.tech2java.java8.methodref;

/**
 * String::new
 * ArrayList::new
 * Integer::new
 * Employee::new
 */
public class ConstructorRefExample {

    public static void main(String[] args) {

        EmployeeInterface employeeInteface=(name, mobileNo)->{
          return new Employee(name,mobileNo);
        };
        Employee employeeByLambda=employeeInteface.getEmployee("cool","1234567890");

        System.out.println(employeeByLambda.getName());
        System.out.println(employeeByLambda.getMobileNo());


        //it should match constructor arguments and method parameters
        EmployeeInterface employeeByConstructorRef=Employee::new;

        Employee employee2=employeeByConstructorRef.getEmployee("test","09876543");
        System.out.println(employee2.getName());
        System.out.println(employee2.getMobileNo());

    }
}
