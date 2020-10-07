package com.groot.service;

import com.groot.dao.Hello;
import com.groot.dao.UserDao;

public class UserServiceImpl implements UserService
{
    UserDao user;

    public void setUser(UserDao user)
    {
        this.user = user;
    }

    public void getUser()
    {
        user.getUser();
    }
}
