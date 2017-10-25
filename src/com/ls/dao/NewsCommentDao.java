package com.ls.dao;

import com.ls.model.NewsComment;

import java.util.List;

/**
 * Created by LS on 2017/10/21 21:13.
 * To Be or Not to Be
 */
public interface NewsCommentDao {
    List<NewsComment> queryAllComments(int infoId);

    boolean addComment(NewsComment newsComment);

    boolean deleteCommentByInfoId(String infoId);
}
