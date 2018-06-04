package com.mr.jpa;


import com.mr.model.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


/**
 * Created by czl on 2018/6/2.
 */
public interface UserJpa extends CrudRepository<User,Integer>{
/*
   @Modifying
    @Query("UPDATE user u set u.user_name=user1.userName,u.user_age=user1.userAge,u.user_bir=user1.userBir WHERE u.user_id =user1.userId")
    void updateByUser( @Param("user1") User user1);*/
}
