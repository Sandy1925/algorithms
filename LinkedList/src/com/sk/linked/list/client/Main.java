package com.sk.linked.list.client;

import com.sk.linked.list.api.ILinkedList;
import com.sk.linked.list.api.LinkedList;

public class Main {

    public static void main(String[] args) {

        ILinkedList<Integer> list = new LinkedList<>();
        list.addAtEnd(1);
        list.addAtEnd(2);
        list.addAtEnd(3);
        list.addAtEnd(4);
        list.addAtBeginning(0);
        list.addAtEnd(5);
        list.addAtBeginning(-1);
        list.insertAtIndex(2,22);
        list.deleteAtBeginning();
        list.deleteAtEnd();
        list.deleteAtEnd();
        list.deleteAtEnd();
        list.addAtBeginning(-1);
        list.forEach(System.out::println);
    }
}
