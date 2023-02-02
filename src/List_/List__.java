package List_;

import java.util.ArrayList;

import java.util.List;

/**
 * @author haohao
 * @version 1.0
 */
public class List__ {
    public static void main(String[] args) {
        //list集合里的元素有序且可重复
        List list = new ArrayList();
        list.add("jack");
        list.add("iii");
        list.add("jack");
        System.out.println(list);
        //支持索引
        System.out.println(list.get(2));
    }
}
