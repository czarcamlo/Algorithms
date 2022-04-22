package com.queue;

import com.queue.Employee;

public class Queue {

    public static void main(String[] args){
        Employee janeJhones = new Employee("Jane", "jhones", 123);
        Employee jhonDoe = new Employee("Jhon", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWillson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        QueueArrays queue = new QueueArrays(5);
        queue.add(janeJhones);
        queue.add(jhonDoe);
        queue.remove();
        queue.add(marySmith);
        queue.remove();
        queue.add(mikeWillson);
        queue.remove();
        queue.add(billEnd);
        //queue.remove();
       // queue.add(janeJhones);

        System.out.println(queue.peek());

        queue.printQueue();



    }
}
