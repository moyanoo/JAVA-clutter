package set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author haohao
 * @version 1.0
 */
public class SetMethod {
    public static void main(String[] args) {
        Set set =new HashSet();
        set.add("ppp");
        set.add("ooo");
        set.add("iii");
        set.add("www");
        set.add("qqq");
        set.add(null);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        for (Object o :set) {
            System.out.println(o);
        }


    }
}
