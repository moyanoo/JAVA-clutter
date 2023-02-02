package Generic_;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author haohao
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Generic02 {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<Student>();
        set.add(new Student("kock",12));
        set.add(new Student("uuu",16));
        set.add(new Student("ppp",14));
        Iterator<Student> iterator = set.iterator();
        while (iterator.hasNext()) {
            Student next =  iterator.next();
            System.out.println(next);
        }
        HashMap studetHashMap = new HashMap<>();

    }
}
class Student{
    private   String name;
    private  int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
}
