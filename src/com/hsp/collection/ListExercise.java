package com.hsp.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author haohao
 * @version 1.0
 */
public class ListExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("w1o");
        list.add("w2o");
        list.add("w3o");
        list.add("w4o");
        list.add("w5o");
        list.add("w6o");
        list.add("w7o");
        list.add("w8o");
        list.add("w9o");
        list.add("w10o");
        list.set(1,"han");
        System.out.println(list.get(4));
        list.remove(5);
        list.set(6,"ooo");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        System.out.println(list);

    }
}

