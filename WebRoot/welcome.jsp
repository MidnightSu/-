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
    
    <title>网站输入</title>
    
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

  
  	<a href="quick.jsp"><font size="2"><i>1.快捷使用</i></font></a>
  	<a href="normal.jsp"><font size="2"><i>2.普通抽取</i></font></a>
  	<a href="collect.jsp"><font size="2"><i>3.查看收藏</i></font></a>
  	<a href="help.jsp"><font size="2"><i>4.使用帮助</i></font></a>
    
<font color="red" size="4"> ${ss }</font>
        </div>
  </center>
  </body>
</html>
