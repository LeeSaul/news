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
            margin-left: -1px;
        }
        #f2{
            margin-left: 12px;
        }
        #f3{
            width: 139px;
        }
        #f4{
            margin-left: 2px;
        }
        #f5{
            margin-left: 10px;
        }
    </style>
</head>
<body>
${info}
<div id="main">
    <span id="title">发表评论信息</span><br/><br/>
    <form action="addComment" method="post">
        评论内容：<input name="userComment" id="f1"/><br/><br/>
        评论时间：<input type="date" name="commentDate" id="f3"><br/><br/>
        <input type="text" name="userId" value="${loginUser.id}" hidden="hidden">
        评论者：<input type="text" value="${loginUser.userName}" id="f2" readonly="readonly"> <br/><br/>
        新闻编号：<input type="text" value="${infoId}" name="infoId" id="f4" readonly="readonly"><br/><br/>
        <input type="submit" value="发表评论" id="f5">
        <a id="bt2" href="queryAllCommentByInfoId?infoId=${infoId}">返回评论列表</a>
    </form>
</div>
</body>
</html>
