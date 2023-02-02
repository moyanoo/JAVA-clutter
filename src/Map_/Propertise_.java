package Map_;

import java.util.Properties;

/**
 * @author haohao
 * @version 1.0
 */
public class Propertise_ {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("jone",100);
//        properties.put(null,100);
//        properties.put("jick",null);
        properties.put("lic",100);
        properties.put("lic",88);
        properties.put("li",88);
        properties.put("c",88);
        System.out.println(properties);
        //通过key获取值
        System.out.println(properties.get("li"));
        properties.remove("c");

    }
}
