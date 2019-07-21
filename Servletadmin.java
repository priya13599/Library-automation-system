package com.abes;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servletadmin
 */
@WebServlet("/Servletadmin")
public class Servletadmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servletadmin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		String val = request.getParameter("c1");
		Connection con;
		String target="";
		if(val.equals("LOGIN"))
		{
			String email = request.getParameter("email");
			String Password = request.getParameter("psw");
			
			
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con = DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:XE","priya","priya");
			
				String str = "select* from libraryloginadmin where EMAIL =? and PASSWORD =?";
				PreparedStatement ps = con.prepareStatement(str);
				ps.setString(1, email);
				ps.setString(2, Password);
			
				ResultSet rs1 = ps.executeQuery();
				
				if(rs1.next())
				{
					
					    target ="AdminFunction.html";
				           	
		        	 
				}
				 else
	        	 {
	        		 target ="invalid.jsp";
	        	 }
					
					
			}
			
			catch (Exception e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			RequestDispatcher rd = request.getRequestDispatcher(target);
			rd.forward(request,response);
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
