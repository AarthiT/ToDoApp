package com.example.demo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class ToDo {
    private int id;
    private List<String> l = new ArrayList<String>();
    private Date created;

    public ToDo(int id,
                List<String> l) {
        this.id = id;
        this.l = l;
        this.created=new Date();
    }
    public ToDo(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getL() {
        return l;
    }

    public void setL(List<String> l) {
        this.l = l;
    }
}
