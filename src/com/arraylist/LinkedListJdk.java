package com.arraylist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListJdk {

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee jhonDoe = new Employee("Jhon", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWillson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 76);
        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(janeJones);
        list.addFirst(jhonDoe);
        list.addFirst(marySmith);
        list.addFirst(mikeWillson);
        Iterator iter = list.iterator();
        System.out.print("Head -> ");

        while (iter.hasNext()){
            System.out.print(iter.next());
            System.out.print("<-> ");
        }
        System.out.println("null");

        list.addLast(billEnd);
        iter = list.iterator();
        System.out.print("Head -> ");

        while (iter.hasNext()){
            System.out.print(iter.next());
            System.out.print("<-> ");
        }
        System.out.println("null");

        list.removeFirst();
        iter = list.iterator();
        System.out.print("Head -> ");

        while (iter.hasNext()){
            System.out.print(iter.next());
            System.out.print("<-> ");
        }
        System.out.println("null");

        list.removeLast();
        iter = list.iterator();
        System.out.print("Head -> ");

        while (iter.hasNext()){
            System.out.print(iter.next());
            System.out.print("<-> ");
        }
        System.out.println("null");
        //ambos imprimen lo mismo
       /* for (Employee employee: list){
            System.out.println(employee);
        } */

    }
}
