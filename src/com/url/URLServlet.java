package com.url;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;

import org.apache.http.client.methods.HttpGet;


import org.apache.http.util.EntityUtils;
import java.util.regex.*;


public class URLServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String tableurl = request.getParameter("tableurl");
		
		
		if(tableurl==null||tableurl.trim().isEmpty()){
			request.setAttribute("ss", "网站为空，请重新输入");
			request.getRequestDispatcher("/welcome.jsp").forward(request, response);
			return;
		}
		Document doc=Jsoup.connect(tableurl).get();
		String title=doc.body().toString();
		
        String regex = "<table.*?>[\\s\\S]*?<\\/table>";
        Pattern mPattern = Pattern.compile(regex);
        Matcher mMatcher = mPattern.matcher(title);
        StringBuffer buffer = new StringBuffer();
        while (mMatcher.find()) {
            buffer.append(mMatcher.group());
        }

		request.setAttribute("ss", buffer);
		request.getRequestDispatcher("/showtable.jsp").forward(request, response);
		


	//	<table.*?>[\s\S]*?<\/table> 


/*	    Connection conn = Jsoup.connect(tableurl); // 建立与url中页面的连接
	    Document doc = conn.get(); // 解析页面
	    Elements links = doc.select("a[href]"); // 获取页面中所有的超链接
        int i = 1;
        for (Element link : links) {
        	if ("阅读全文".equals(link.text())) { // 获取页面中每篇文章‘阅读全文’的链接，进入文章
        		Document doc2 = Jsoup.connect(link.attr("abs:href")).get(); // 解析每篇文章的页面
        		System.out.println("第" + i + "篇：" + doc2.title()); // 把该文章的标题打印出来
        		i++;
        		request.setAttribute("ss", "第" + i + "篇：" + doc2.title());
        		request.getRequestDispatcher("/showtable.jsp").forward(request, response);

        	}
        }
*/
	//	request.setAttribute("ss", "提取网站为："+tableurl+"表格数据如下");
	//	request.getRequestDispatcher("/showtable.jsp").forward(request, response);
		
		
	}

	
}
