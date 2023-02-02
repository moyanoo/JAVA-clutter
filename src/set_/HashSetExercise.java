package set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/**
 * @author haohao
 * @version 1.0
 */
public class HashSetExercise {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee01("ppp",4,new MyDate(5235,65,3)));
        hashSet.add(new Employee01("ppp",6,new MyDate(5235,65,3)));
        hashSet.add(new Employee01("ppp",4,new MyDate(5235,65,3)));
        hashSet.add(new Employee01("ooo",4,new MyDate(5235,65,3)));
        hashSet.add(new Employee01("ppp",4,new MyDate(523,6,7)));
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }
}
class Employee01{
    private String name;
    private int age;
    private MyDate brithday;

    public Employee01(String name, int age, MyDate brithday) {
        this.name = name;
        this.age = age;
        this.brithday = brithday;
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

    public MyDate getBrithday() {
        return brithday;
    }

    public void setBrithday(MyDate brithday) {
        this.brithday = brithday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee01 that = (Employee01) o;
        return Objects.equals(name, that.name) && Objects.equals(brithday, that.brithday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, brithday);
    }

    @Override
    public String toString() {
        return "Employee01{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", brithday=" + brithday +
                '}';
    }
}
class MyDate{
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year && month == myDate.month && day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
