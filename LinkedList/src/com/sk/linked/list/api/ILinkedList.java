package com.sk.linked.list.api;

public interface ILinkedList<T> extends Iterable<T>{

    public boolean isEmpty();
    public long size();
    public void addAtEnd(T value);
    public void addAtBeginning(T value);
    public void insertAtIndex(int index, T value);
    public void deleteAtBeginning();
    public void deleteAtEnd();
    public void deleteAtIndex(int index);


}
