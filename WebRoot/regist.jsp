<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <link href="./login.css" rel="stylesheet" type="text/css" /> 
    <base href="<%=basePath%>">
    
    <title>注册</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>

  <body>
  <div>

        <center>
    <font color="red" size="200">&nbsp;</font>
    <h1><font color="red" size="15">注册</font> </h1>
    <form action="RegistServlet" method="post">
    <font color="red" size="4">请输入帐号：</font> <input type="text" name="username"><br/>
    <font color="red" size="4">请输入密码：</font> <input type="password" name="password"><br/>
    <font color="red" size="4"> 请确认密码：</font> <input type="password" name="rpsw"><br/>
    <input type="submit" value="注册">
    </form>
   <font color="red" size="4"> ${msg }</font>
      </center>
    </div>

   
  </body>
</html>
