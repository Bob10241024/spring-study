package com.xixi.service;

import com.xixi.dao.UserDao;
import com.xixi.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{

    private UserDao userDao = new UserDaoImpl();


    //利用set进行动态实现值的注入！
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }


}
