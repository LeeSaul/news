<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2017/10/22
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>更新新闻</title>
    <style>
        #main{
            text-align: center;
            margin-left: 10px;
            margin-top: 10px;
        }
        #title{
            font-weight: bold;
        }
        #bt2{
            margin-top: 10px;
            margin-left: 10px;
        }
        #f1{
            margin-left: 11px;
        }
        #f2{
            margin-left: 11px;
        }
        #f3{
            width: 133px;
            margin-left: 0px;
        }
        #f33{
            margin-left: -7px;
        }
        #f4{
            margin-left: 11px;
        }
        #f44{
            margin-left: 19px;
        }
        #f5{
            margin-left: 52px;
        }
        .f6{
            margin-left: 10px;
        }
    </style>
</head>
<body>
<h3>${info}</h3>
<div id="main">
    <span id="title">更新新闻信息</span><br/>
    <form action="updateNewsInfo" method="post"><br/><br/>
        新闻标题：<input type="text" name="title" value="${newsInfo.title}" id="f1"><br/><br/>
        新闻内容：<input name="content" id="f2" value="${newsInfo.content}"><br/><br/>
        <span id="f33">发布时间：</span>&nbsp;&nbsp;<input type="date" name="releaseDate" id="f3" value="${newsInfo.releaseDate}"><br/><br/>
        <input type="text" name="userId" value="${loginUser.id}" hidden="hidden">
        <input type="text" name="id" value="${newsInfo.id}" hidden="hidden" >
        <span id="f44">发布者：</span><input type="text" value="${loginUser.userName}" id="f4" readonly="readonly"><br/><br/>
        <input type="submit" value="更新" id="f5">
        <span id="bt2">
            <c:choose>
                <c:when test="${loginUser.type==1}">
                    <a href="queryUserNewsInfo?userId=${loginUser.id}" class="f6">返回新闻列表</a>
                </c:when>
                <c:otherwise>
                    <a href="queryAdminNewsInfo" class="f6">返回新闻列表</a>
                </c:otherwise>
            </c:choose>
        </span>
    </form>
</div></body>
</html>
