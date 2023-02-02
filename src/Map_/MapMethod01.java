package Map_;

import java.util.*;

/**
 * @author haohao
 * @version 1.0
 */
public class MapMethod01 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("ppp",new Book01("",100));
        map.put("ppp",777);
        map.put("ooo","iii");
        map.put("uuu","iii");
        map.put("yyy","iip");
        map.put("ttt","iiu");
        map.put(null,"iiu");
        map.put("ttt",null);
        Set keySet = map.keySet();
        //1.1 增强for
        for (Object key :keySet) {
            System.out.println(key+"--"+map.get(key));
        }
        //1.2 迭代器
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(map.get(next));
        }
        //(取出所有的values值)
        Collection values = map.values();
        //2.1增强for
        for (Object value :values) {
            System.out.println(value);
        }
        //2.2同1.2
        //3 通过Entryset来获取
        Set set = map.entrySet();
        //3.1 增强for
        System.out.println("----------");
        for (Object o : set) {
            //将entry转换成Map.Entry
            Map.Entry m = (Map.Entry) o;
            System.out.println(m.getKey()+"--"+m.getValue());

        }
        //3.2 迭代器
        Iterator iterator1 = set.iterator();
        while (iterator1.hasNext()) {
            Object next = iterator1.next();
            //向下转型
            Map.Entry m = (Map.Entry) next;
            System.out.println(m.getKey()+"---"+m.getValue());
        }

    }
}
