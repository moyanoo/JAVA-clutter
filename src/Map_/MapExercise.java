package Map_;

import sun.management.snmp.jvminstr.JvmRTInputArgsEntryImpl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author haohao
 * @version 1.0
 */
public class MapExercise {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("741852",new Person("ppp",18001,"741852"));
        map.put("741853",new Person("iii",18000,"741852"));
        map.put("741854",new Person("ooo",17999,"741852"));
        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry next = (Map.Entry)iterator.next();
            Person value = (Person)next.getValue();
            if (value.getSalary()>18000){
                System.out.println(value);
            }
        }
        Set set1 = map.keySet();
        for (Object key :set1) {
            Person key1 = (Person) map.get(key);
            if(key1.getSalary()>18000){
                System.out.println(key1);
            }
        }



    }
}
class Person{
    private String name;
    private double salary;
    private String id;

    public Person(String name, double salary, String id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id='" + id + '\'' +
                '}';
    }
}
