package com.jamie.dao.impl;

import com.jamie.dao.UserDao;
import lombok.Data;

@Data
public class UserDaoImpl implements UserDao {
    private UserDao userDao;

    @Override
    public void saveUser() {
        System.out.println("Successfully Save User!");
    }
}
