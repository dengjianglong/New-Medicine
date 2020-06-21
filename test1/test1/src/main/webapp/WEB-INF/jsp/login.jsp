<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>管理员登录</title>

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/img/login.css"/>
    <style type="text/css">
    body {
    background-image: url("${pageContext.request.contextPath}/img/1.jpg");
    background-repeat:no-repeat ;
    background-size:100% 100%; 
    background-attachment: fixed;
}
    
    </style>
</head>
<body>
    <!--把logo放在左上角-->
    <div id="image1" style="POSITION:absolute;LEFT:0px; VISIBILITY:visible; TOP:0px; HEIGHT:135px; width:12%;">
        <img src="${pageContext.request.contextPath}/img/logo.png" id="image11" hspace="6" border="0" alt="image1"   />
    </div>
    <!--
        把logo放在右上角
        <div id="image2" style="POSITION:absolute;LEFT:88%; VISIBILITY:visible;TOP:0px; HEIGHT:135px; width:12%;">
        <img src="images/logo.png" id="image22" hspace="6" border="0" alt="image1"   />
        </div>
    -->

    <div id="login_frame">
        <p id="image_logo"><img src="${pageContext.request.contextPath}/img/touxiang.png"></p>
        <form>

            <p><label class="label_input">用户名</label><input type="text" id="username" class="text_field"/></p>
            <p><label class="label_input">密码</label><input type="text" id="password" class="text_field"/></p>
    
            <div id="login_control">
                <a href="${pageContext.request.contextPath}/dm/findAllDM.do"><input type="button" id="btn_login" value="登录"/></a>
                <a id="forget_pwd" href="forget_pwd.html">忘记密码？</a>
            </div>
        </form>
    </div>
</body>
</html>