package com.zy.java.demo;

import com.zy.java.demo.tij.generator.BasicGenerator;
import com.zy.java.demo.tij.generator.Generator;
import com.zy.java.demo.tij.widget.CountedObject;

public class Main
{
    public static void main(String[] asrgs)
    {
        System.out.println("FUCK THE WORLD.");

        Generator<CountedObject> gen = BasicGenerator.create(CountedObject.class);
        for (int i = 0; i < 5; ++i)
            System.out.println(gen.next());
    }
}
