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
    
    <title>普通抽取</title>
    
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
  <center>
   <div>
   <font color="red" size="200">&nbsp;</font>
    <h2>${msg }</h2>
    <form action="URLServlet" method="post">
<font color="red" size="4">请输入目的网站地址</font>：<input type="text" name="tableurl"><br/>
  <input type="submit" value="确定">
  

    </form>
<font color="red" size="4"> ${ss }</font>
        </div>
  </center>
  </body>
</html>
