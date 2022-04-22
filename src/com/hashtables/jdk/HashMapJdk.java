package com.hashtables.jdk;

import com.hashtables.jdk.Employee;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapJdk {

    public static void main(String[] args){
        Employee janeJhones = new Employee("Jane", "jhones", 123);
        Employee jhonDoe = new Employee("Jhon", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWillson = new Employee("Mike", "Wilson", 3245);

        Map<String, Employee> hashMap = new HashMap<String, Employee>();
        hashMap.put("Jones", janeJhones);
       // hashMap.put("Doe", jhonDoe);
        hashMap.put("Smith", marySmith);
        System.out.println(hashMap.getOrDefault("someone", mikeWillson));
        //Employee employee = hashMap.put("Doe", mikeWillson);
        hashMap.putIfAbsent("Doe", mikeWillson);

        //System.out.println(employee);

       // System.out.println(hashMap.containsKey("Doe"));
       // System.out.println(hashMap.containsValue(janeJhones));

       /* Iterator<Employee> iterator = hashMap.values().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/

       // hashMap.forEach((k,v) -> System.out.println("Key = " + k + "Employee = " + v));
    }
}
