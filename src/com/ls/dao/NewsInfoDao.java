package com.ls.dao;

import com.ls.model.NewsInfo;

import java.util.List;

/**
 * Created by LS on 2017/10/21 21:13.
 * To Be or Not to Be
 */
public interface NewsInfoDao {
    List<NewsInfo> queryNewsInfoByUserId(String userId);
    List<NewsInfo> queryAllNewsInfo();
    boolean releaseNews(NewsInfo newsInfo);
    boolean updateNews(NewsInfo newsInfo);
    NewsInfo queryNewsInfoById(String id);
    boolean updateNewsInfo(NewsInfo newsInfo);

    boolean deleteNewsInfo(String id);
}
