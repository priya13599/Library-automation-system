package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.Service.ServiceBook;

import Bean.BookDetails;



/**
 * Servlet implementation class BookController
 */
@WebServlet("/BookController")
public class BookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookController() {
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
		HttpSession sn=request.getSession();
		 ServiceBook ser=new ServiceBook();
		 String target="";
		 String str="";
		 int n;
		
		String button=request.getParameter("c1");
		try
		{
		if(button.equals("INSERT"))
		{  
			String name = request.getParameter("name");
			String no = request.getParameter("number");
			String authorname = request.getParameter("authorname");
			String pubname = request.getParameter("pubname");
			String  quantity= request.getParameter("quantity");
			String edition = request.getParameter("edition");
			String price = request.getParameter("price");
			
			
			BookDetails s= new BookDetails(name,no,authorname,pubname,quantity,edition,price);
			
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
			target+="Insert.jsp";
		}
		
		
		
		else if(button.equals("DELETE"))
		{
			 
			  String bookno=request.getParameter("number");
			 
			   n=ser.delete(bookno);
			  if(n>0)
					 str+="Record deleted successfully";
				 else
					 str+="Record not found";
				 
					  sn.setAttribute("s1", str);
					 target+="Delete.jsp";
			 
			 
		}
		
		
		
		else if(button.equals("SEARCH"))
		{

			String bookno=request.getParameter("number");
			  BookDetails obj1=ser.search(bookno);
			  sn.setAttribute("s1", obj1);
				 target+="Search.jsp";
		}
		
		
		else if(button.equals("DISPLAY"))
		{
			ArrayList<BookDetails> al=ser.display();
			sn.setAttribute("s1", al);

			 target+="Display.jsp";
		}
		
		
		else if(button.equals("MODIFY"))
		{
			String name = request.getParameter("name");
			String no = request.getParameter("number");
			String authorname = request.getParameter("authorname");
			String pubname = request.getParameter("pubname");
			String  quantity= request.getParameter("quantity");
			String edition = request.getParameter("edition");
			String price = request.getParameter("price");
			
			BookDetails s= new BookDetails(name,no,authorname,pubname,quantity,edition,price);
			  
	
			int n1 = ser.modify(no,s);
			if(n1 > 0)
			str+="Record Modified successfully";
			else
			 str+="Record not found";
				 
			 sn.setAttribute("s1", str);
			 target+="Modify.jsp";
			 
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
