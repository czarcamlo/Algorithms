package com.arraylist;

public class Challenge2 {

    public static void main(String[] args){
         Integer one = 1;
         Integer two = 2;
         Integer three = 3;
         Integer four = 4;

         EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
         list.insertSorted(three);
         list.printList();
         list.insertSorted(two);
         list.printList();
         list.insertSorted(one);
         list.printList();
         list.insertSorted(four);
         list.printList();
    }
}
