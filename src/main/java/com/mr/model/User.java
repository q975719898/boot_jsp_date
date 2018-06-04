package com.mr.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by czl on 2018/6/2.
 */
@Entity(name = "user")
public class User {
    @Id
    @GeneratedValue
    private Integer userId;
    @Column(name = "userName",length = 200)
    private String userName;
    @Column(name="userAge",length = 3)
    private Integer userAge;
    @Column(name="userBir")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date userBir;
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public Date getUserBir() {
        return userBir;
    }

    public void setUserBir(Date userBir) {
        this.userBir = userBir;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userAge=" + userAge +
                ", userBir=" + userBir +
                '}';
    }
}
