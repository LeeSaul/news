<%@ taglib prefix="foreach" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            height: 35px;
        }
        #t1{
            font-size: x-large;
            margin-left: 10px;
            margin-top: 10px;
        }
        #b1{
            height: 550px;
        }
        table,tr,td{
            float: none;
            border: solid 1px #392933;
        }
        table{
            text-align: center;
            width: 100%;
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
<div  id="t">
    <span id="t1">新闻评论平台</span>
</div>
<div id="b1">
    <table cellspacing="0px" cellpadding="0px">
        <tr>
            <td>评论ID</td>
            <td>新闻ID</td>
            <td>评论内容</td>
            <td>评论时间</td>
            <td>评论者</td>
        </tr>
        <foreach:forEach items="${newsCommentsList}" var="newsComment">
            <tr>
                <td>${newsComment.id}</td>
                <td>${newsComment.infoId}</td>
                <td>${newsComment.userComment}</td>
                <td>${newsComment.commentDate}</td>
                <td>${newsComment.newsUser.userName}</td>
            </tr>
        </foreach:forEach>
    </table>
</div>

<div id="end">
    <c:choose>
        <c:when test="${loginUser.type==1}">
            <a href="queryUserNewsInfo?userId=${loginUser.id}">返回查看新闻</a>
        </c:when>
        <c:otherwise>
            <a href="queryAdminNewsInfo">返回查看新闻</a>
        </c:otherwise>
    </c:choose>
</div>
</body>
</html>
</html>
