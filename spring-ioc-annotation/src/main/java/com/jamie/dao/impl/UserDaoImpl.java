package com.jamie.dao.impl;

import com.jamie.dao.UserDao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

@Data
@Repository
@NoArgsConstructor
public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser() {
        System.out.println("Successfully save user!");
    }
}
