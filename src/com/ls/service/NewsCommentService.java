package com.ls.service;

import com.ls.model.NewsComment;

import java.util.List;

/**
 * Created by LS on 2017/10/21 21:14.
 * To Be or Not to Be
 */
public interface NewsCommentService {
    List<NewsComment> queryAllComments(int infoId);

    boolean addComment(NewsComment newsComment);

    boolean deleteCommentByInfoId(String infoId);
}
