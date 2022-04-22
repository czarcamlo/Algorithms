package com.hashtables.linearprobing;

public class SimpleHashTable {

    private StoredEmployee[] hashTable;

    public SimpleHashTable(){
        hashTable = new StoredEmployee[10];
    }

    public void put(String key, Employee employee){
        int hashKey = hashKey(key);
        if (occupied(hashKey)){
            int stopIndex = hashKey;
            if (hashKey == hashTable.length-1){
                hashKey = 0;
            } else {
                hashKey++;
            }
            while (occupied(hashKey) && hashKey != stopIndex){
                hashKey = (hashKey + 1) % hashTable.length;
            }
        }
        if(occupied(hashKey)){
            System.out.println("Sorry there´s already an employee at position " + hashKey);
        } else {
            hashTable[hashKey] = new StoredEmployee(key,employee);
        }
    }

    public Employee remove(String key) {
        int hashKey = findKey(key);
        if (hashKey == -1) {
            return null;
        }
        Employee employee = hashTable[hashKey].employee;
        hashTable[hashKey] = null;
        StoredEmployee[] oldHashTable = hashTable;
        hashTable = new StoredEmployee[oldHashTable.length];
        for (int i = 0; i < oldHashTable.length; i++){
            if(oldHashTable[i] != null){
                put(oldHashTable[i].key, oldHashTable[i].employee);
            }
        }
        return employee;
    }

    public Employee get(String key){
        int hashKey = findKey(key);
        if(hashKey == -1){
            return null;
        }
        return hashTable[hashKey].employee;
    }

    private int findKey(String key){
        int hashKey = hashKey(key);
        if ( hashTable[hashKey] != null && hashTable[hashKey].key.equals(key)){
            return hashKey;
        }
        int stopIndex = hashKey;
        if (hashKey == hashTable.length - 1) {
            hashKey = 0;
        } else {
            hashKey++;
        }
        while (hashKey != stopIndex && hashTable[hashKey] != null && !hashTable[hashKey].key.equals(key)) {
            hashKey = (hashKey + 1) % hashTable.length;
        }
        if (hashTable[hashKey] != null && hashTable[hashKey].key.equals(key)){
            return hashKey;
        } else{
            return -1;
        }
    }

    private int hashKey (String key){
        return key.length() % hashTable.length;
    }

    private boolean occupied (int index){
        return hashTable[index] != null;
    }

    public void printHashTable(){
        for (int i = 0; i < hashTable.length; i++){
            if(hashTable[i] == null){
                System.out.println("Empty");
            } else {
                System.out.println("Position " + i + ": " + hashTable[i].employee);
            }
        }
    }
}
