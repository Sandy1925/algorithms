package com.sk.stack.client;

import com.sk.stack.api.IStack;
import com.sk.stack.api.ResizeableArray;

public class Main {
    public static void main(String[] args) {

        IStack<Integer> stack = new ResizeableArray<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        System.out.println(stack.pop());
        System.out.println(stack.size());
    }
}
