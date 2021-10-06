package pers.experiment3;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class BookDB {
    //创建一个map存放图书
    private static Map<String,Book> books = new LinkedHashMap<String,Book>();
    //*初始化数据库
    static{
        books.put("1",new Book("1","javaweb开发"));
        books.put("2",new Book("2","jdbc开发"));
        books.put("3",new Book("3","java基础"));
        books.put("4",new Book("4","struts开发"));
        books.put("5",new Book("5","spring开发"));
    }

    //获取所有图书的名称
    public static Collection<Book> getAll(){
        return books.values();
    }
    //按照id获取单个图书
    public static Book getBook(String id){
        return books.get(id);
    }
}
