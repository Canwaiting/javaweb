package pers.experiment3;

import java.io.Serializable;

public class Book implements Serializable {
    //todo 网站上说不用管
    //todo 不知道有什么用 序列化进出的数据流
    private static final long SerialVersionUID = 1L;
    private String id;
    private String name;
    public Book(){
    }
    public Book(String id,String name){
        this.id = id;
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
