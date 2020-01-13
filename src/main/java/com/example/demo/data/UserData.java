package com.example.demo.data;

import com.example.demo.model.ToDo;
import com.example.demo.model.User;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class UserData {
    private static Map<Integer,User> u = new HashMap<Integer, User>();
    private static Map<Integer,ToDo> t = new HashMap<Integer, ToDo>();
    public void insertUser(User user){
        u.put(user.getId(),user);
    }

    public Collection<User> getAllUsers(){
        return u.values();
    }

    public void insertNewTodo(ToDo todo){
        t.put(todo.getId(),todo);
    }

    public ToDo getToDo(int id){
        return t.get(id);

    }
    public void deleteToDoList(int id){
        t.remove(id);

    }

    public void updateToDo(ToDo todo) {
        t.put(todo.getId(), todo);
    }

    public void deleteToDo(int id, int no){
        t.get(id).getL().remove(no);

    }



}
