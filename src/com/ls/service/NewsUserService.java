package com.ls.service;

import com.ls.model.NewsUser;

/**
 * Created by LS on 2017/10/21 21:14.
 * To Be or Not to Be
 */
public interface NewsUserService{
    boolean register(NewsUser newsUser);
    NewsUser login(NewsUser newsUser);

    NewsUser queryUserName(String userName);
}
