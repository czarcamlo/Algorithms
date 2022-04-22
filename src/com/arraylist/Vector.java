package com.arraylist;

import java.util.List;
// #2
public class Vector {
    public static void main(String[] args) {
        List<Employee> employeeList = new java.util.Vector<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("Jhon", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));
    }
}
