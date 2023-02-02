package List_;

import sun.awt.image.ByteArrayImageSource;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;


/**
 * @author haohao
 * @version 1.0
 */
public class ListExercise02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        //List list = new LinkedList();
        //List list = new Vector();
        list.add(new Book("hong","cao",52));
        list.add(new Book("xi","wu",63));
        list.add(new Book("shui","shi",32));
        list.add(new Book("san","luo",66));
        for (Object o :list) {
            System.out.println(o);
        }
        sort(list);
        System.out.println("hou");
        for (Object o :list) {
            System.out.println(o);
        }


    }
    public static void sort(List list){

        for (int i = 0; i < list.size()-1; i++) {
            for (int j = 0; j < list.size()-i-1; j++) {
                Book book1=(Book)list.get(j);
                Book book2=(Book)list.get(j+1);
                if(book1.getPrice()> book2.getPrice()){
                    list.set(j,book2);
                    list.set(j+1,book1);
                }

            }
        }
    }


}

class Book {
    private String name;
    private String person;
    private double price;

    public Book(String name, String person, double price) {
        this.name = name;
        this.person = person;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "名称" + name + "\t \t 价格" + price + "\t \t 作者" + person;
    }
}
