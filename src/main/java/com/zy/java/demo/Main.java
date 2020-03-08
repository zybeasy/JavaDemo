package com.zy.java.demo;

import com.zy.java.demo.tij.generator.BasicGenerator;
import com.zy.java.demo.tij.generator.Generator;
import com.zy.java.demo.tij.widget.CountedObject;

import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] asrgs)
    {
        System.out.println("FUCK THE WORLD.");

        Generator<CountedObject> gen = BasicGenerator.create(CountedObject.class);
        for (int i = 0; i < 5; ++i)
            System.out.println(gen.next());

        System.out.println("FUCK THE WORLD END");


        String a = "Hello World";
        String b = "ZHANG";
        int[] arr = {1, 2, 3};
        List list = Arrays.asList(arr);
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(Arrays.toString(arr));
    }
}
