package Generic_;

import java.util.*;

/**
 * @author haohao
 * @version 1.0
 */
public class DAO<T>{
    private Map<String,T> map=new HashMap<>();

    public T get(String id){
        return map.get(id);
    }public void update(String id , T entity){
        map.put(id,entity);
    }
    public List<T> list(){
        List<T> list = new ArrayList<>();
        Set<String> keySet = map.keySet();
        for(String k: keySet){
            list.add(map.get(k));
        }

        return list;
    }
    public void save(String id,T entity){
        map.put(id,entity);
    }

    @Override
    public String toString() {
        return "DAO{" +
                "map=" + map +
                '}';
    }
}
