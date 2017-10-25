package com.ls.service.impl;

import com.ls.dao.NewsCommentDao;
import com.ls.model.NewsComment;
import com.ls.service.NewsCommentService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by LS on 2017/10/21 21:14.
 * To Be or Not to Be
 */
@Transactional
public class NewsCommentServiceImpl implements NewsCommentService {
    private NewsCommentDao newsCommentDao;

    public NewsCommentDao getNewsCommentDao() {
        return newsCommentDao;
    }

    public void setNewsCommentDao(NewsCommentDao newsCommentDao) {
        this.newsCommentDao = newsCommentDao;
    }

    @Override
    public List<NewsComment> queryAllComments(int infoId) {
        return newsCommentDao.queryAllComments(infoId);
    }

    @Override
    public boolean addComment(NewsComment newsComment) {
        return newsCommentDao.addComment(newsComment);
    }

    @Override
    public boolean deleteCommentByInfoId(String infoId) {
        return newsCommentDao.deleteCommentByInfoId(infoId);
    }
}
