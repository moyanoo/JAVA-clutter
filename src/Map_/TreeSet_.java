package Map_;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author haohao
 * @version 1.0
 */
public class TreeSet_ {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //调用compareTo方法进行字符串的大小比较
                return ((String) o2).length() - ((String) o1).length();
            }
        });

        treeSet.add("ppp");
        treeSet.add("oio");
        treeSet.add("uu");
        treeSet.add("p");
        treeSet.add("ee");
        System.out.println(treeSet);
        //按照字符串大小来排序
        //使用treeset提供的构造器，可以传入一个比较器
    }
}
