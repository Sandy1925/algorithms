package com.sk.stack.api;

public interface IStack<T> {

    public long size();
    public boolean isEmpty();
    public void push(T item);
    public T pop();

}
