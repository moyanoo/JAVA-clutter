package Map_;

import java.sql.Array;
import java.util.ArrayList;

/**
 * @author haohao
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HomeWork02 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        Car car01 = new Car("宝马", 400000);
        Car car02 = new Car("宾利", 500000);
        arrayList.add(car01);
        arrayList.add(car02);
        System.out.println(arrayList);
        arrayList.remove(car01);
        System.out.println(arrayList);
        System.out.println(arrayList.contains("宝马"));

        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());
//        arrayList.clear();

        arrayList.addAll(arrayList);
        System.out.println(arrayList);
        arrayList.containsAll(arrayList);
//        arrayList.removeAll(arrayList);
//        System.out.println(arrayList);
        for (Object o :arrayList) {
            System.out.println(o);
        }


    }
}
class Car{
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
