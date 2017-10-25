<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2017/10/21
  Time: 19:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
    <style>
        #login {
            width: 300px;
            height: 300px;
            margin-left: 500px;
            margin-top: 50px;
        }

        #user {
            font-weight: bold;
            text-align: center;
            margin-left: 70px;
        }

        #loginButton {
            text-align: center;
            margin-left: 78px;
        }

        #radio {
            margin-left: 26px;
            margin-top: 15px;
        }
    </style>
    <script src="jquery/jquery-min.js"></script>
    <script>
        $(function () {
            alert(111);
            $("#userName").blur(function () {
                var aj=$.ajax({
                    type: "post",
                    url: "ajaxTest",
                    data: "userName=" + $("#userName").val(),
                    success: function (msg) {
//                        $("#error").html(msg);
                        $("#error").html(aj.responseText);
                    }
                });
            });
        });
        /*$(function () {
            $("#userName").blur(function () {
                $.ajax({
                    type: "post",
                    url: "ajaxTest2",
                    data: "userName=" + $("#userName").val(),
                    dataType: "json",
                    success: function (msg) {
                        $("#error").html(msg.name);
                    }
                });
            });
        });*/
    </script>
</head>
<body>
<div id="login">
    <span id="user">用户登录</span><br/><br/>
    <form action="login" method="post">
        用户名：<input type="text" name="userName" id="userName"><span id="error" style="color: red"></span><br/><br/>
        密&nbsp;&nbsp;&nbsp;码：<input type="password" name="userPassword"><br/>
        <div id="radio">
            <input type="radio" name="type" value="0" checked="checked">管理员
            &nbsp;<input type="radio" name="type" value="1">普通用户
        </div>
        <br/>
        <input id="loginButton" type="submit" value="登录">
    </form>
</div>
</body>
</html>
