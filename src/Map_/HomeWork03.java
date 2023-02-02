package Map_;

import java.util.*;

/**
 * @author haohao
 * @version 1.0
 */
public class HomeWork03 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("jack",650);
        map.put("tom",1200);
        map.put("smith",2900);
        System.out.println(map);
        map.put("jack",2600);
        System.out.println(map);
        Set keyset = map.keySet();
        for (Object o :keyset) {
            map.put(o, (Integer)map.get(o)+100);
            System.out.println(map);
        }
        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry next = (Map.Entry) iterator.next();
            System.out.println(next.getKey()+"---"+next.getValue());
        }
        Collection values = map.values();
        for (Object value :values) {
            System.out.println("gongzi"+value);
        }


    }
}
