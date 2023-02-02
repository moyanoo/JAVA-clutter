package Map_;

import java.awt.print.Book;
import java.util.HashMap;
import java.util.Map;

/**
 * @author haohao
 * @version 1.0
 */
public class MapMethod {
    public static void main(String[] args) {
        //演示map接口方法
        Map map = new HashMap();
        //添加
        map.put("ppp",new Book01("",100));
        map.put("ppp",777);
        map.put("ooo","iii");
        map.put("uuu","iii");
        map.put("yyy","iip");
        map.put("ttt","iiu");
        map.put(null,"iiu");
        map.put("ttt",null);
        System.out.println(map);
        //删除
        map.remove(null);
        System.out.println(map);
        //获取
        Object val=map.get("ttt");
        System.out.println(val);
        //获取元素个数
        System.out.println(map.size());
        //判断个数是否为零
        System.out.println(map.isEmpty());
        //清除
        map.clear();
        System.out.println(map);
        //查找键是否存在
        map.put("ppp","ooo");
        System.out.println(map.containsKey("ppp"));
        System.out.println(map);

    }

}
class Book01{
    private String name;
    private int age;

    public Book01(String name, int age) {
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
        return "Book01{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
