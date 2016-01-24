package com.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.dao.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public Boolean userLogin(String userName, String pwd) {
        Boolean back = userDao.userLogin(userName, pwd);        
        return back;
    }

}
