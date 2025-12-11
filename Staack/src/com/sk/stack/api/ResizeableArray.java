package com.sk.stack.api;

public class ResizeableArray <T> implements IStack<T>{
    T[] arr = (T[]) new Object[10];
        int n = 0;


    @Override
    public long size() {
        return n;
    }

    @Override
    public boolean isEmpty() {
        return n==0;
    }

    @Override
    public void push(T item) {
        if(n == arr.length) { // if the length of array is as same as the number of elements add then we need to resize the array
            resize(2*arr.length);
        }
        arr[n++]= item;
    }

    @Override
    public T pop() {
        T result = arr[--n];
        arr[n] = null;
        if(n>0 && n == arr.length/4){
            resize(n/2);
        }
        return result;
    }

    private void resize(int max){
        T[] temp = (T[]) new Object[max];

        for (int i =0; i<n; i++){
            temp [i] = arr[i];
        }
        arr = temp;
    }
}
