package com.trees.binarysearchtree;

public class BinarySearchTree {

    public static void main(String[] args){

        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);
        intTree.insert(17);

        intTree.traverseInOrder();
        System.out.println();
        /*System.out.println(intTree.get(27).getData());
        System.out.println(intTree.get(17).getData());
        System.out.println(intTree.get(888));*/

        intTree.delete(888);
        intTree.traverseInOrder();
        System.out.println();
        //intTree.delete(27);


        //intTree.delete(25);
    }
}
