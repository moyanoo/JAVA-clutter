package set_;

import java.util.LinkedHashSet;
import java.util.Objects;

/**
 * @author haohao
 * @version 1.0
 */
public class HashSetExercise01 {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new Car("aaa",52000));
        linkedHashSet.add(new Car("bbb",2000));
        linkedHashSet.add(new Car("ccc",100000));
        linkedHashSet.add(new Car("ccc",100000));
        linkedHashSet.add(new Car("aa",52000));
        System.out.println(linkedHashSet);




    }
}
class Car{
    private String name;
    private int price;

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
