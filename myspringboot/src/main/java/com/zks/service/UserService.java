package com.zks.service;

import com.zks.model.MyResult;
import com.zks.model.User;

/**
 * Created by 韦师兄
 * 2019-03-12 14:41
 */
public interface UserService {
    MyResult login(User user);
}
