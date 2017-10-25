package com.ls.service.impl;

import com.ls.dao.NewsInfoDao;
import com.ls.model.NewsInfo;
import com.ls.service.NewsInfoService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by LS on 2017/10/21 21:13.
 * To Be or Not to Be
 */
@Transactional
public class NewsInfoServiceImpl implements NewsInfoService{
    private NewsInfoDao newsInfoDao;

    public NewsInfoDao getNewsInfoDao() {
        return newsInfoDao;
    }

    public void setNewsInfoDao(NewsInfoDao newsInfoDao) {
        this.newsInfoDao = newsInfoDao;
    }

    @Override
    public List<NewsInfo> queryNewsInfoByUserId(String userId) {
        return newsInfoDao.queryNewsInfoByUserId(userId);
    }

    @Override
    public List<NewsInfo> queryAllNewsInfo() {
        return newsInfoDao.queryAllNewsInfo();
    }

    @Override
    public boolean releaseNews(NewsInfo newsInfo) {
        return newsInfoDao.releaseNews(newsInfo);
    }

    @Override
    public NewsInfo queryNewsInfoById(String id) {
        return newsInfoDao.queryNewsInfoById(id);
    }

    @Override
    public boolean updateNewsInfo(NewsInfo newsInfo) {
        return newsInfoDao.updateNewsInfo(newsInfo);
    }

    @Override
    public boolean deleteNewsInfo(String id) {
        return newsInfoDao.deleteNewsInfo(id);
    }
}
