package com.abes;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Util.Util;

/**
 * Servlet implementation class SevletPassword
 */
@WebServlet("/SevletPassword")
public class SevletPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SevletPassword() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try
		{
			PrintWriter pw=response.getWriter();
			response.setContentType("text/html");
			HttpSession sn=request.getSession();
			Connection con=Util.getConnection();
			
			 PreparedStatement ps;
			 String target="";
			 String cmd="";
			 int n;
			 String email=request.getParameter("op");
			 String np=request.getParameter("np");
			 String cp=request.getParameter("cp");
      if(np.equals(cp))
	{
				 
					String button=request.getParameter("change");
					if(button.equals("CHANGE ADMIN PASSWORD"))
					 {
					   cmd="update libraryloginadmin set PASSWORD=?  where PASSWORD=?";
					   ps = con.prepareStatement(cmd);
							ps.setString(1,np );
							ps.setString(2,email);
							n = ps.executeUpdate();
							if(n>0)
								 pw.println("<body bgcolor='#66ffc2'><center><font color=\"#660029\", size=\"7px\",width=\"600px\"<h1>"+"Password Changed Succesfully"+"</h1></font></center></body>");
							else
								pw.println("<body bgcolor='#66ffc2'><center><font color=\"#660029\", size=\"7px\",width=\"600px\"<h1>"+"Operation Not Completed Succesfully"+"</h1></font></center></body>");
				     }
					
					
					else if(button.equals("CHANGE LIBRARIAN PASSWORD"))
				     {
				   cmd="update loginlibrarian set PASSWORD=?  where PASSWORD=?";
				   
					 ps = con.prepareStatement(cmd);
						ps.setString(1,np );
						ps.setString(2,email);
						n = ps.executeUpdate();
						if(n>0)
							 pw.println("<body bgcolor='#66ffc2'><center><font color=\"#99004d\", size=\"7px\",width=\"600px\"<h1>"+"Password Changed Succesfully"+"</h1></font></center></body>");
						else
							pw.println("<body bgcolor='#66ffc2'><center><font color=\"#99004d\", size=\"7px\",width=\"600px\"<h1>"+"Operation Not Completed Succesfully"+"</h1></font></center></body>");
			        }
	}
					
					 else
					 {
						pw.println("<body bgcolor='#66ffc2'><center><font color=\"#660029\", size=\"7px\",width=\"600px\"<h1>"+"Please Enter Same Password"+"</h1></font></center></body>");}
				}// try close
					catch(Exception e)
					{
						
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
