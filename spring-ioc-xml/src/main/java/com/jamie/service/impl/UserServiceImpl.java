package com.jamie.service.impl;

import com.jamie.dao.UserDao;
import com.jamie.service.UserService;
import lombok.Data;

@Data
public class UserServiceImpl implements UserService {

private UserDao userDao;

    @Override
    public void saveUser() {
        userDao.saveUser();
    }
}
