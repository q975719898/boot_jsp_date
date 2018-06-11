package com.mr.controller;

import com.mr.model.User;
import com.mr.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by czl on 2018/6/11.
 */
@RestController
public class SwaggerController {
    @Autowired
    private UserService userService;

    @ApiOperation(value="获取用户列表", notes="获取用户列表")
    @GetMapping("/select")
    public  List<User> select(){
        List<User> list=userService.select();
        return list;
    }
    @RequestMapping("/toAddPage")
    public String add(){
        return "add";
    }

    @ApiOperation(value="创建用户", notes="根据User对象创建用户")
    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    @PostMapping("/user")
    public void insert(@RequestBody User user){
        userService.add(user);
    }
    @ApiOperation(value="删除用户", notes="根据url的id来指定删除用户")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long", paramType = "path")
    @DeleteMapping("/user/{id}")
    public void delete(@PathVariable("id") Integer id){
        userService.delete(id);
    }
    @ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer", paramType = "path")
    @GetMapping("/toUpdatePage/{id}")
    public  User userService(@PathVariable("id") Integer id){
        User user= userService.userService(id);
        return user;
    }
    /* @PutMapping("/user")*/
    @ApiOperation(value="更新信息", notes="根据url的id来指定更新用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long",paramType = "path"),
            @ApiImplicitParam(name = "user", value = "用户实体user", required = true, dataType = "User")
    })
    @PutMapping("/user/{id}")
    public void update(@PathVariable("id") Integer id,@RequestBody User user){
        userService.updateUser(user);
    }
}
