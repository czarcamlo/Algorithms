package com.arraylist;

public class EmployeeDoublyLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size = 0;
    private IntegerNode headInt;
    private int sizeInt;

    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        if(head == null){
            tail = node;
        } else {
            head.setPrevious(node);
        }
        head = node;
        size++;
    }

    public void addToEnd(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        if(tail == null){
            head = node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
        size++;
    }

    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return head == null;
    }

    public EmployeeNode removeFromFront(){
        if (isEmpty()){
            return  null;
        }
        EmployeeNode removeNode = head;
        if(head.getNext() == null){
            tail = null;
        } else {
            head.getNext().setPrevious(null);
        }
        head = head.getNext();
        size--;
        removeNode.setNext(null);
        return removeNode;
    }

    public EmployeeNode removeFromEnd(){
        if (isEmpty()){
            return  null;
        }
        EmployeeNode removeNode = tail;
        if(tail.getPrevious() == null){
            head = null;
        }else {
            tail.getPrevious().setNext(null);
        }
        tail = tail.getPrevious();
        size--;
        removeNode.setNext(null);
        return removeNode;
    }


    //challenge 1
    public boolean addBefore (Employee newEmployee, Employee existEmployee){
        if (head == null){
            return false;
        }
        //find the existing employee
        EmployeeNode current = head;
        while(current != null && !current.getEmployee().equals(existEmployee)){
            current = current.getNext();
        }
        if(current == null){
            return false;
        }
        EmployeeNode newNode = new EmployeeNode(newEmployee);
        newNode.setPrevious(current.getPrevious());
        newNode.setNext(current);
        current.setPrevious(newNode);
        if (head == current){
            head = newNode;
        } else {
            newNode.getPrevious().setNext(newNode);
        }
        size++;
        return true;
    }

    public void insertSorted(Integer value) {
        // assumption; the list is sorted
        if (headInt == null || headInt.getValue() >= value) {
            addToFront(value);
            return;
        }
        //find the insertion point
        IntegerNode current = headInt.getNext();
        IntegerNode previous = headInt;
        while(current != null && current.getValue() < value){
            previous = current;
            current = current.getNext();
        }
        IntegerNode newNode = new IntegerNode(value);
        newNode.setNext(current);
        previous.setNext(newNode);
        sizeInt++;
    }

    public void addToFront(Integer value) {
        IntegerNode node = new IntegerNode(value);
        node.setNext(headInt);
        headInt = node;
        sizeInt++;
    }


    public void printList(){
        EmployeeNode current = head;
        System.out.print("Head -> ");
        while(current != null){
            System.out.print(current);
            System.out.print("<-> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
