package com.block123;

public class Child extends Parent {
    int x = 3;
    public void print() { System.out.println(x);}

    public static void main(String s[]) {
        new Child().print();
    }

    }