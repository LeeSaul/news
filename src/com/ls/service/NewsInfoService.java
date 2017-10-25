package com.ls.service;

import com.ls.model.NewsInfo;

import java.util.List;

/**
 * Created by LS on 2017/10/21 21:13.
 * To Be or Not to Be
 */
public interface NewsInfoService {
    List<NewsInfo> queryNewsInfoByUserId(String userId);
    List<NewsInfo> queryAllNewsInfo();
    boolean releaseNews(NewsInfo newsInfo);
    NewsInfo queryNewsInfoById(String id);
    boolean updateNewsInfo(NewsInfo newsInfo);
    boolean deleteNewsInfo(String id);
}
