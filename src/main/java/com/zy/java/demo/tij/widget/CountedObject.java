package com.zy.java.demo.tij.widget;

public class CountedObject {
    private static long counter = 0;
    private  final long id = counter++;

    public long getId() {
        return id;
    }

    public String toString() {
        return getClass().getSimpleName() + id;
    }
}
