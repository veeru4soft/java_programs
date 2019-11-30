package com.vb.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class FormServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String name = null, gender = null, ms = null, addrs = null, qlfy = null, crs = null, hb = null;
		int age = 0;
		PrintWriter pw = null;
		pw = response.getWriter();
		response.setContentType("text/html");
		name = request.getParameter("tname");
		age = Integer.parseInt(request.getParameter("tage"));
		gender = request.getParameter("gen");
		ms = request.getParameter("ms");
		addrs = request.getParameter("taddres");
		qlfy = request.getParameter("qlfy");
		//crs[] = request.getParameterValues("crs");
		//hb[] = request.getParameterValues("hb");
		
		
		pw.println("<br> name="+name);
		pw.println("<br> age="+age);
		pw.println("<br> Gender="+gender);
		pw.println("<br> Marital Status ="+ms);
		pw.println("<br> Address="+addrs);
		pw.println("<br> Qualification="+qlfy);
		pw.println("<br> Courses="+crs);
		pw.println("<br> Hobbies="+hb);
		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		doGet(request, response);
	}
		
}