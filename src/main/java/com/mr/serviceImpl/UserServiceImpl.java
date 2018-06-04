package com.mr.serviceImpl;

import com.mr.jpa.UserJpa;
import com.mr.model.User;
import com.mr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by czl on 2018/5/30.
 */
@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserJpa userJpa;

    @Override
    public List<User> select() {
        Iterable<User> all = userJpa.findAll();
        List<User> list =new ArrayList<>();
        all.forEach(single ->{list.add(single);});
        return list;
    }

    @Transactional
    @Override
    public void add(User user) {
        userJpa.save(user);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        userJpa.delete(id);
    }

    @Override
    public User userService(Integer id) {
        User one = userJpa.findOne(id);
        return one;
    }

    @Transactional
    @Override
    public void updateUser(User user) {

    }
}
