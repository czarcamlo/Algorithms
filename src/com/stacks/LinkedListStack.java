package com.stacks;

public class LinkedListStack {
    public static void main(String[] args) {

        Employee janeJhones = new Employee("Jane", "jhones", 123);
        Employee jhonDoe = new Employee("Jhon", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWillson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        LinkedStack stack = new LinkedStack();

        stack.push(janeJhones);
        stack.push(jhonDoe);
        stack.push(marySmith);
        stack.push(mikeWillson);
        stack.push(billEnd);

       // stack.printStack();

        //System.out.println(stack.peek());

        System.out.println("Popped: " + stack.pop());
        System.out.println(stack.peek());
    }
}
