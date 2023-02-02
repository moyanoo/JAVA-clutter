package Generic_;

import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author haohao
 * @version 1.0
 */
public class GenericHomeWork01 {
    public static void main(String[] args) {
        DAO<User> dao=new DAO<>();
        dao.save("OO1",new User(1,19,"jojo"));
        dao.save("OO2",new User(123,34,"lplp"));
        dao.save("OO3",new User(89,23,"spsp"));
        List<User> list = dao.list();
        System.out.println(list);
        dao.update("003",new User(1,99,"lan"));
        list=dao.list();
        System.out.println(list);
    }




}



