package com.sk.linked.list.api;

import java.util.Iterator;

public class LinkedList<T> implements ILinkedList<T>{

    private Node head;
    private long size;

    public LinkedList (){

    }

    public LinkedList (T value){
        if(this.head==null){
            this.head = new Node(value);
        }
        this.size++;
    }


    @Override
    public boolean isEmpty() {
        return this.size ==0;
    }

    @Override
    public long size() {
        return this.size;
    }

    @Override
    public void addAtEnd(T value) {
        Node newNode = new Node(value);
        if(this.head == null){
            this.head = newNode;
        }else{
            Node temp = this.head;
            while(temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
        this.size++;
    }

    @Override
    public void addAtBeginning(T value) {
        Node newNode = new Node(value);
        if(this.head==null){
            this.head = newNode;
        }else{
            Node temp = this.head;
            this.head = newNode;
            this.head.setNext(temp);
        }
        this.size++;
    }

    @Override
    public void insertAtIndex(int index, T value) {
         int counter = 0;
         Node newNode = new Node(value);
         Node temp = this.head;
         while(counter!=(index-1)){
             temp = temp.getNext();
             counter++;
         }
         newNode.setNext(temp.getNext());
         temp.setNext(newNode);
    }

    @Override
    public void deleteAtBeginning() {
        this.head = this.head.getNext();
        this.size--;
    }

    @Override
    public void deleteAtEnd() {
        Node temp = this.head;
        while (temp.getNext().getNext()!=null){
            temp = temp.getNext();
        }
        temp.setNext(null);
    }

    @Override
    public void deleteAtIndex(int index) {

    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    private class Node{
        private T value;
        private Node next;

        public Node(T value){
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    private class LinkedListIterator implements Iterator<T>{
        Node current = head;
        @Override
        public boolean hasNext() {
            return current!=null;
        }

        @Override
        public T next() {
            Node temp = current;
            current = temp.getNext();
            return temp.getValue();
        }
    }

    public Node getHead() {
        return this.head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }
}
