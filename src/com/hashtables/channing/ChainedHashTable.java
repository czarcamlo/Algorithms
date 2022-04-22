package com.hashtables.channing;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashTable {

    private LinkedList<StoredEmployee>[] hashTable;

    public ChainedHashTable(){
        hashTable= new LinkedList[10];
        for (int i = 0; i < hashTable.length; i++){
            hashTable[i] = new LinkedList<StoredEmployee>();
        }
    }

    public Employee get (String key){
        int hashKey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashTable[hashKey].listIterator();
        StoredEmployee employee = null;
        while (iterator.hasNext()){
            employee = iterator.next();
            if(employee.key.equals(key)){
                return employee.employee;
            }
        }
        return null;
    }

    public Employee remove(String key){
        int hashKey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashTable[hashKey].listIterator();
        StoredEmployee employee = null;
        int index = -1;
        while (iterator.hasNext()){
            employee = iterator.next();
            index++;
            if(employee.key.equals(key)){
                break;
            }
        }
        if (employee == null || !employee.key.equals(key)){
            return null;
        } else {
            hashTable[hashKey].remove(index);
            return employee.employee;
        }
    }

    public void put(String key, Employee employee){
        int hashKey = hashKey(key);
        hashTable[hashKey].add(new StoredEmployee(key, employee));
    }

    private int hashKey(String key){
        //return key.length() % hashTable.length;
        return Math.abs(key.hashCode() % hashTable.length);
    }

    public void printHahTable(){
        for (int i = 0; i < hashTable.length; i++){
            if( hashTable[i].isEmpty()){
                System.out.println("Position: " + i + ": empty" );
            }
            else {
                System.out.print("Position: " + i + ": " );
                ListIterator<StoredEmployee> iterator = hashTable[i].listIterator();
                while(iterator.hasNext()){
                    System.out.print(iterator.next().employee);
                    System.out.print("->");
                }
                System.out.println("null");
            }
        }
    }
}
