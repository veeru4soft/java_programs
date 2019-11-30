package com.vb.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class VoterServlet extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		String name =null, tage = null;
		int age = 0;
		PrintWriter pw = res.getWriter();
		name = req.getParameter("name");
		tage = req.getParameter("age");
		age = Integer.parseInt(tage);
		
		if(age >= 18)
			pw.println("<h1 style='color:green'> " +name+" You are Eligible for Vote </h1> ");
		else
			pw.println("<h1 style='color:red'> " +name+" You are not Eligible for Vote </h1> ");
		
		pw.close();
	}
}