<%@ taglib prefix="foreach" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2017/10/21
  Time: 22:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>成功页面</title>
    <style>
        #t{
            background-color: lightblue;
            width: 100%;
            height: 50px;
        }
        #t1{
            margin-top: 10px;
            margin-left: 10px;
            float: left;
            font-size: x-large;
            font-weight: bold;
        }
        .t2{
            margin-right: 10px;
            float: right;
            font-size: 15px;
            margin-top: 14px;
        }
        #user{
            color: red;
        }
        #b1{
            float: none;
            height: 550px;
        }
        table,tr,td{
            border: solid 1px;
            border-radius: 1px;
            text-align: center;
        }
        table{
            width:100%;
        }
        #end{
            text-align: center;
            background-color: lightblue;
            width: 100%;
            height: 20px;
            margin-top: 10px;
            margin-bottom: 10px;
        }
    </style>
</head>
<body>
<div id="t">
    <span id="t1">新闻发布平台</span>
    <span class="t2">欢迎用户<span id="user">${loginUser.userName}</span>登录</span>
</div>

<div id="b1">
    <table cellpadding="0" cellspacing="0">
        <tr>
            <td>新闻ID</td>
            <td>新闻标题</td>
            <td>新闻内容</td>
            <td>发布日期</td>
            <td>发布者</td>
            <td colspan="4">操作</td>
        </tr>
        <foreach:forEach items="${newsInfoList}" var="newsInfo">
            <tr>
                <td>${newsInfo.id}</td>
                <td>${newsInfo.title}</td>
                <td>${newsInfo.content}</td>
                <td>${newsInfo.releaseDate}</td>
                <td>${newsInfo.newsUser.userName}</td>
                <td colspan="4">
                    <a href="updateNewsInfoJsp?id=${newsInfo.id}">修改</a>
                    <a href="deleteNewsInfo?id=${newsInfo.id}&userId=${loginUser.id}">删除</a>
                    <a href="queryAllCommentByInfoId?infoId=${newsInfo.id}">查看评论</a>
                    <a href="addCommentJsp?infoId=${newsInfo.id}">发表评论</a>
                </td>
            </tr>
        </foreach:forEach>
    </table>
</div>



<div id="end">
    <a href="login.jsp">更改用户</a>
    <a href="addNews.jsp">发布新闻</a>
</div>
</body>
</html>
