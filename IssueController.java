package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.Service.ServiceIssue;


import Bean.IssueDetails;

/**
 * Servlet implementation class IssueController
 */
@WebServlet("/IssueController")
public class IssueController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IssueController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		HttpSession sn =request.getSession();
		 ServiceIssue ser =new ServiceIssue();
		 String target="";
		 String str="";
	
		
		String button=request.getParameter("c1");
		try
		{
		if(button.equals("INSERT"))
		{  
			String id = request.getParameter("id");
			String name = request.getParameter("name");
			String branch = request.getParameter("branch");
			String section = request.getParameter("section");
			String email= request.getParameter("email");
			String rollno = request.getParameter("rollno");
			String bookno = request.getParameter("bookno");
			String bookname = request.getParameter("bookname");
			String issuedate = request.getParameter("issuedate");
			String duedate = request.getParameter("duedate");
		
			
			 SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
			IssueDetails s= new IssueDetails(id,name,branch,section,email,rollno,bookno,bookname,df.parse(issuedate),df.parse(duedate));
			
			  boolean flag=false;
			  // System.out.println("dao inserr");
				flag = ser.insert(s);
			//System.out.println("inser boo"+flag);
			if(flag) {
				 str+=" Record added successfully";
				
				 }
		      else
		    	 str+=" Record not added"; 
				 sn.setAttribute("s1", str);
			target+="InsertIssue.jsp";
		}
		
		

		RequestDispatcher rd=request.getRequestDispatcher(target);
		 rd.forward(request, response);
		}
		catch(Exception e)
		{
			pw.print(e);
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
