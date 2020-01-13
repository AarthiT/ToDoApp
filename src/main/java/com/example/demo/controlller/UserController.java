package com.example.demo.controlller;

import com.example.demo.data.UserData;
import com.example.demo.model.ToDo;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/home")
public class UserController{
    @Autowired
    private UserData userdata;
    @RequestMapping(method=RequestMethod.GET)
    public Collection<User> welcome(){
        return userdata.getAllUsers();
    }

    @PostMapping("/new")
    public void insertUser(@RequestBody User user){
        userdata.insertUser(user);
    }

    @PostMapping("/new/todo")
    public void insertToDo(@RequestBody ToDo todo){
        userdata.insertNewTodo(todo);
    }

    @GetMapping(value="/{id}")
    public ToDo getList(@PathVariable("id") int id) {
        return userdata.getToDo(id);
    }

    @DeleteMapping(value="/{id}")
    public void deleteList(@PathVariable("id") int id) {
        userdata.deleteToDoList(id);
    }

    @PutMapping("/new/update")
    public void updateList(@RequestBody ToDo toDo) {
         userdata.updateToDo(toDo);
    }

    @GetMapping(value="{id}/{no}")
    public void deleteToDo(@PathVariable("id") int id, @PathVariable("no") int no){
        userdata.deleteToDo(id,no-1);
    }


}
