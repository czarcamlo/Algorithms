package com.arraylist;

public class DoublyLinkedList {

    public static void main(String[] args){
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee jhonDoe = new Employee("Jhon", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWillson = new Employee("Mike", "Wilson", 3245);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

        list.addToFront(janeJones);
        list.addToFront(jhonDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWillson);
        list.printList();
        System.out.println(list.getSize());
        Employee billEnd = new Employee("Bill", "End", 78);

        list.addToEnd(billEnd);
        list.printList();
        System.out.println(list.getSize() );

        /*list.removeFromFront();
        list.printList();
        System.out.println(list.getSize() );

        list.removeFromEnd();
        list.printList();
        System.out.println(list.getSize() );*/

        list.addBefore(billEnd, jhonDoe);
        list.printList();

        list.addBefore(new Employee("Someone", "Else", 38), mikeWillson );
        list.printList();


    }
}
