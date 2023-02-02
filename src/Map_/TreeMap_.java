package Map_;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author haohao
 * @version 1.0
 */
public class TreeMap_ {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o2).length() - ((String) o1).length();
            }
        });
        treeMap.put("jack", "ppp");
        treeMap.put("jac", "pp");
        treeMap.put("dd", "ooo");
        treeMap.put("idiu", "pii");
        treeMap.put("uuo", "p");
        System.out.println(treeMap);
    }
}
