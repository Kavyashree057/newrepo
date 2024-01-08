package com.eizitech.cookies;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Validate() {
        // TODO Auto-generated constructor stub
    }
 
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
	String username=request.getParameter( "uname")	;
	String password=request.getParameter( "psw")	;
 
	if(username.equals("kavya")&&password.equals("1234"))
	{
		HttpSession session=request.getSession();
		session.setAttribute("username", username);
		response.sendRedirect("Welcome");
		
		
	}else
	{
		response.getWriter().println("invalid credentials");
	}
		
		
		
		
		
		
		
		
		
	}}
		