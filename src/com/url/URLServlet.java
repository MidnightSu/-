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
			request.setAttribute("ss", "��վΪ�գ�����������");
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


/*	    Connection conn = Jsoup.connect(tableurl); // ������url��ҳ�������
	    Document doc = conn.get(); // ����ҳ��
	    Elements links = doc.select("a[href]"); // ��ȡҳ�������еĳ�����
        int i = 1;
        for (Element link : links) {
        	if ("�Ķ�ȫ��".equals(link.text())) { // ��ȡҳ����ÿƪ���¡��Ķ�ȫ�ġ������ӣ���������
        		Document doc2 = Jsoup.connect(link.attr("abs:href")).get(); // ����ÿƪ���µ�ҳ��
        		System.out.println("��" + i + "ƪ��" + doc2.title()); // �Ѹ����µı����ӡ����
        		i++;
        		request.setAttribute("ss", "��" + i + "ƪ��" + doc2.title());
        		request.getRequestDispatcher("/showtable.jsp").forward(request, response);

        	}
        }
*/
	//	request.setAttribute("ss", "��ȡ��վΪ��"+tableurl+"�����������");
	//	request.getRequestDispatcher("/showtable.jsp").forward(request, response);
		
		
	}

	
}
