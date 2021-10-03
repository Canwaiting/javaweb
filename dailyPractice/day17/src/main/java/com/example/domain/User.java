package com.example.domain;

import java.util.Date;

public class User {
    //make the variable
    private String name;
    private int age;
    private Date birthday;

    //parameter function
    public User(String name,int age,Date birthday){
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }
    public User(){

    }
//    public void setName(String name){this.name = name;}
//    public String getName(){
//        return name;
//    }
//
//    public void setAge(int age){
//        this.age = age;
//    }
//    public int getAge(){
//        return age;
//    }
//
//    public void setDate(Date birthday){
//        this.birthday = birthday;
//    }
//    public Date getDate(){
//        return birthday;
//    }
}
