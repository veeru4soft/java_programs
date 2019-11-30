package com.vb.servlet;

import javax.servlet.*;
import java.io.*;
import java.util.*;

public class DateServlet extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		Date d = new Date();
		pw.println("<b> <i> <cener> Date and Time is"+d+"</b></i></center>");
		pw.close();
	}
}