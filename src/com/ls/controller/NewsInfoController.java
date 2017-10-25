package com.ls.controller;

import com.ls.model.NewsInfo;
import com.ls.model.NewsUser;
import com.ls.service.NewsCommentService;
import com.ls.service.NewsInfoService;
import com.ls.service.NewsUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by LS on 2017/10/22 10:32.
 * To Be or Not to Be
 */
@Controller
public class NewsInfoController {
    @Resource
    private NewsInfoService newsInfoService;
    @Resource
    private NewsCommentService newsCommentService;

    @RequestMapping(value = "/queryUserNewsInfo",method = {RequestMethod.POST,RequestMethod.GET})
    public String queryNewsInfoByUserId(String userId, HttpSession session,Model model){
        List<NewsInfo> newsInfoList = newsInfoService.queryNewsInfoByUserId(userId);
//        session.setAttribute("newsInfoList",null);
        if (newsInfoList!=null&&newsInfoList.size()>0){
            model.addAttribute("newsInfoList",newsInfoList);
//            session.setAttribute("newsInfoList",newsInfoList);
        }
        return "success";
    }

    @RequestMapping(value = "/queryAdminNewsInfo",method = {RequestMethod.POST,RequestMethod.GET})
    public String queryNewsInfoByAdminId( HttpSession session){
        List<NewsInfo> allNewsInfo = newsInfoService.queryAllNewsInfo();
        session.setAttribute("allNewsInfo",null);
        if (allNewsInfo!=null&&allNewsInfo.size()>0){
            session.setAttribute("newsInfoList",allNewsInfo);
        }
        return "success";
    }

    @RequestMapping(value = "/releaseNewsInfo",method = RequestMethod.POST)
    public String releaseNewsInfo(NewsInfo newsInfo,String type){
        boolean b = newsInfoService.releaseNews(newsInfo);
        if (b) {
            if (type.equals("0")){
                return "forward:/queryAdminNewsInfo";
            }else {
                return "forward:/queryUserNewsInfo?usrId="+newsInfo.getUserId();
            }
        }
        return "fail";
    }

    @RequestMapping(value = "/updateNewsInfoJsp",method = {RequestMethod.GET,RequestMethod.POST})
    public String updateNewsInfoJsp(String id, HttpSession session){
        NewsInfo newsInfo = newsInfoService.queryNewsInfoById(id);
        if (newsInfo!=null) {
            session.setAttribute("newsInfo",newsInfo);
            return "update";
        }
        return "fail";
    }

    @RequestMapping(value = "/updateNewsInfo",method = RequestMethod.POST)
    public String updateNewsInfo(NewsInfo newsInfo){
        boolean b = newsInfoService.updateNewsInfo(newsInfo);
        if (b) {
            return "forward:/queryUserNewsInfo?usrId="+newsInfo.getUserId();
        }
        return "fail";
    }
    @RequestMapping(value = "/deleteNewsInfo",method = RequestMethod.GET)
    public String deleteNewsInfo(String id,String userId){
        boolean b = newsInfoService.deleteNewsInfo(id);
        String infoId=id;
        newsCommentService.deleteCommentByInfoId(infoId);
        if (b) {
            System.out.println("---"+userId);
            if (userId.equals("0")){
                return "forward:/queryAdminNewsInfo";
            }
            return "forward:/queryUserNewsInfo?usrId="+userId;
        }
        return "fail";
    }


}
