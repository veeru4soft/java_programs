package com.vb.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class CountryServlet extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		String statesIndia[] = {"AP", "TS", "MH", "MP", "UP"};
		String statesUsa[] = {"CA", "LA", "NY", "CR", "AZ"};
		String statesAus[] = {"TMS", "BB", "CBR"};
		
		String country = null;
		country = req.getParameter("country");
		
		if(country.equals("india"))
			pw.println("states = " +Arrays.toString(statesIndia));
		else if(country.equals("usa"))
			pw.println("states = " +Arrays.toString(statesUsa));
		else if(country.equals("aus"))
			pw.println("states = " +Arrays.toString(statesAus));
		
		pw.close();
	}
}