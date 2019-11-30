package com.vb.servlet;

import javax.servlet.*;
import java.io.*;
import java.util.*;

public class WordServlet extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/msword");
		PrintWriter pw = res.getWriter();
		pw.println("<table border='0'>");
		pw.println("<tr><th> Player</th> <th> Role</th></tr>");
		pw.println("<tr><td> Dhoni</td> <td> Captain</td></tr>");
		pw.println("<tr><td> Sachin</td> <td> All Rounder</td></tr>");
		pw.println("</table>");
		pw.close();
	}
}