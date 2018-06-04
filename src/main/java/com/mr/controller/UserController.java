package com.mr.controller;

import com.mr.model.User;
import com.mr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by czl on 2018/5/30.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/select")
    public String select(Model model){
        List<User>list=userService.select();
       model.addAttribute("list",list);
        return "list";
    }
    @RequestMapping("/toAddPage")
    public String add(){
        return "add";
    }
    @PostMapping("/user")
    public String insert(User user){
        userService.add(user);
        return "redirect:/select";
    }
    @DeleteMapping("/user/{id}")
    public String delete(@PathVariable("id") Integer id){
        userService.delete(id);
        return "redirect:/select";
    }
    @RequestMapping("/toUpdatePage/{id}")
    public  String userService(@PathVariable("id") Integer id, Model model){
        User user= userService.userService(id);
        model.addAttribute("user",user);
        return "update";
    }
   /* @PutMapping("/user")*/
   @PutMapping("/user")
    public String update(User user){
        userService.updateUser(user);
        return "redirect:/select";
    }
}
