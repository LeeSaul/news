package com.ls.controller;

import com.ls.model.NewsUser;
import com.ls.service.NewsUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.print.Pageable;
import java.io.IOException;


/**
 * Created by LS on 2017/10/21 22:07.
 * To Be or Not to Be
 */
@Controller
public class NewsUserController {
    @Resource
    private NewsUserService newsUserService;

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register(NewsUser newsUser){
        boolean b = newsUserService.register(newsUser);
        if (b){
            return "success";
        }
        return "fail";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(NewsUser newsUser, HttpSession session){
        NewsUser loginUser = newsUserService.login(newsUser);
        if (loginUser!=null){
            session.setAttribute("loginUser",loginUser);
            if (newsUser.getType()==1){
                return "forward:/queryUserNewsInfo?userId="+loginUser.getId();
            }else {
                return "forward:/queryAdminNewsInfo";
            }
        }
        return "fail";
    }

    //ajax方法
    @RequestMapping(value = "/ajaxTest",method = RequestMethod.POST)
    public void ajaxTest(String userName, HttpServletResponse response) throws IOException {
        NewsUser newsUser = newsUserService.queryUserName(userName);
        if (newsUser!=null){
            response.getWriter().write("");
        }else {
            response.getWriter().write("用户名为空");
        }
        /*if ("".equals(userName)){
            response.getWriter().write("null");
        }else {
            response.getWriter().write("ok");
        }*/
    }

    @RequestMapping(value = "ajaxTest2",method = RequestMethod.POST,produces = "text/html;charset=utf-8")
    @ResponseBody
    public String ajax2(String userName){
        NewsUser newsUser = newsUserService.queryUserName(userName);
        System.out.println("===+"+userName);
        if (newsUser!=null){
            return "{\"name\":\"已经存在\"}";
        }else {
            return "{\"name\":\"可以使用\"}";
        }
        /*if ("".equals(userName)){
            response.getWriter().write("null");
        }else {
            response.getWriter().write("ok");
        }*/
    }
}
