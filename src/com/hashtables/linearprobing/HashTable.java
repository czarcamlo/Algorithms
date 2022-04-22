package com.hashtables.linearprobing;

public class HashTable {

    public static void main(String[] args) {
        Employee janeJhones = new Employee("Jane", "jhones", 123);
        Employee jhonDoe = new Employee("Jhon", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWillson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);


        SimpleHashTable ht = new SimpleHashTable();
        ht.put("Jones", janeJhones);
        ht.put("Doe", jhonDoe);
        ht.put("Wilson", mikeWillson);
        ht.put("Smith", marySmith);

       // ht.put("End", billEnd);

        ht.printHashTable();

        System.out.println("Retrieve: " + ht.get("Wilson"));
        System.out.println("Retrieve: " + ht.get("Smith"));

        ht. remove("Wilson");
        ht.remove("Jones");

        ht.printHashTable();
        System.out.println("Retrieve: " + ht.get("Smith"));
    }
}
