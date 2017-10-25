package com.ls.controller;

import com.ls.model.NewsComment;
import com.ls.service.NewsCommentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by LS on 2017/10/22 20:05.
 * To Be or Not to Be
 */
@Controller
public class NewsCommentController {
    @Resource
    private NewsCommentService newsCommentService;


    @RequestMapping(value = "/queryAllCommentByInfoId",method = {RequestMethod.GET,RequestMethod.POST})
    public String queryAllCommentByInfoId(int infoId,HttpSession session){
        List<NewsComment> newsCommentsList = newsCommentService.queryAllComments(infoId);
        session.setAttribute("newsCommentsList",null);
        if (newsCommentsList!=null){
            session.setAttribute("newsCommentsList",newsCommentsList);
        }
        return "commentInfo";
    }

    @RequestMapping(value = "/addCommentJsp",method = RequestMethod.GET)
    public String addCommentJsp(String infoId, HttpServletRequest request){
        request.setAttribute("infoId",infoId);
        return "addComment";
    }

    @RequestMapping(value = "/addComment",method = RequestMethod.POST)
    public String addComment(NewsComment newsComment, Model model){
        boolean b = newsCommentService.addComment(newsComment);
        if (b){
            return "forward:/queryAllCommentByInfoId?infoId="+newsComment.getInfoId();
        }
        return "fail";
    }
}

