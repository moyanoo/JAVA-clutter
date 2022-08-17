package com.hsp.collection;


import com.sun.javaws.OperaPreferences;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author haohao
 * @version 1.0
 */
public class Collection_ {
    public static void main(String[] args) {
        Collection List = new ArrayList();
        List.add(new Dog("jj",14));
        List.add(new Dog("bb",15));
        List.add(new Dog("hh",19));
        Iterator iterator = List.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        for (Object dog :List) {
            System.out.println(dog);
        }


    }
}
class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}