package com.example.day17;
//import java.awt.*;
import java.util.Date;

public class User {
    private String name;
    private int age;
    private Date birthday;
    public User(String name,int age,Date birthday){
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }
    public User(){

    }

    public void setBirthday(Date birthday){
        this.birthday = birthday;
    }
    public Date getBirthday(){
        return birthday;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
