package com.example.demo.model;
import com.fasterxml.jackson.annotation.JsonTypeId;

import java.util.UUID;
public class User {

    private int id;
    private String name;

    public User(int id,String name){
        this.id=id;
        this.name=name;
    }
    public User(){}

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}
