package com.vb.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class WishServlet extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		Calendar c = null;
		int hour = 0;
		c = Calendar.getInstance();
		hour = c.get(Calendar.HOUR_OF_DAY);
		if(hour <= 12)
			pw.println("<h1 style='color:red'> Good Morning </h1> ");
		else if(hour <= 17)
			pw.println("<h1 style='color:red'> Good Afternoon </h1> ");
		else if(hour <= 20)
			pw.println("<h1 style='color:red'> Good Evening </h1> ");
		else
			pw.println("<h1 style='color:red'> Good Night </h1> ");
		pw.println("<br> <a href='http://localhost:8080/WishApp/page.html'> home</a> ");
		pw.close();
	}
}