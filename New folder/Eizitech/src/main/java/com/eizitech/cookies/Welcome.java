package com.eizitech.cookies;

import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    /**
     * Default constructor.
     */
    public Welcome() {
        // TODO Auto-generated constructor stub
    }
 
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		HttpSession session = request.getSession(false);
		if(session!=null && session.getAttribute("username")!=null)
		{
			String username=(String)session.getAttribute("username");
			
			response.getWriter().println("welcome:"+username)	;
			
			//response.getWriter().println("<form action=\"./Logout\" >"+"<button type='submit'>Logout</button> </form>");
			response.sendRedirect("Logout.html");
			
		}else
		{
			response.sendRedirect("Login.html");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}}
