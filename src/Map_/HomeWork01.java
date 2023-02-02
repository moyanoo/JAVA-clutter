package Map_;

import java.util.ArrayList;

/**
 * @author haohao
 * @version 1.0
 */
public class HomeWork01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new News("yyyyyyyy"));
        arrayList.add(new News("eeeee"));
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {

            //System.out.println(arrayList.get(i));
            News news = (News) arrayList.get(i);
            System.out.println(processTitle(news.getTitle()));
        }
    }
    public static String processTitle(String title){
        if(title==null){
            return "";
        }
        if(title.length()>5){
            return title.substring(0,5);
        } else {
            return title;
        }
    }
}

class News {
    private String title;
    private String content;

    public News(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                '}';
    }
}
