package com.mr.service;


import com.mr.model.User;

import java.util.List;

/**
 * Created by czl on 2018/5/30.
 */
public interface UserService {
    List<User> select();

    void add(User user);

    void delete(Integer id);

    User userService(Integer id);

    void updateUser(User user);
}
