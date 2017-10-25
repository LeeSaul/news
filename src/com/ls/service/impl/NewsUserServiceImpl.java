package com.ls.service.impl;

import com.ls.dao.NewsUserDao;
import com.ls.model.NewsUser;
import com.ls.service.NewsUserService;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by LS on 2017/10/21 21:14.
 * To Be or Not to Be
 */
@Transactional
public class NewsUserServiceImpl implements NewsUserService {
    private NewsUserDao newsUserDao;
    public NewsUserDao getNewsUserDao() {
        return newsUserDao;
    }

    public void setNewsUserDao(NewsUserDao newsUserDao) {
        this.newsUserDao = newsUserDao;
    }

    @Override
    public boolean register(NewsUser newsUser) {
        return newsUserDao.register(newsUser);
    }

    @Override
    public NewsUser login(NewsUser newsUser) {
        return newsUserDao.login(newsUser);
    }

    @Override
    public NewsUser queryUserName(String userName) {
        return newsUserDao.queryUserName(userName);
    }
}
