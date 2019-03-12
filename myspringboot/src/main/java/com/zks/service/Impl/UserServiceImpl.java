package com.zks.service.Impl;

import com.zks.dao.UserDao;
import com.zks.model.MyResult;
import com.zks.model.User;
import com.zks.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 韦师兄
 * 2019-03-12 14:42
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public MyResult login(User user) {
        User u = new User();
        List<User> list=new ArrayList<>();

        return null;
    }
}
