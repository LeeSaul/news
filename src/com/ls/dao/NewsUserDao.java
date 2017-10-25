package com.ls.dao;

import com.ls.model.NewsUser;


/**
 * Created by LS on 2017/10/21 21:12.
 * To Be or Not to Be
 */
public interface NewsUserDao {
    boolean register(NewsUser newsUser);
    NewsUser login(NewsUser newsUser);

    NewsUser queryUserName(String userName);

}
