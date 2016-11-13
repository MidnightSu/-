package com.url;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




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


		request.setAttribute("ss", "提取网站为："+tableurl+"表格数据如下");
		request.getRequestDispatcher("/showtable.jsp").forward(request, response);

	}
	
	
}
