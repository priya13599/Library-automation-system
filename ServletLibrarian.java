package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Service.ServiceLibrarian;

import Bean.LibrarianDetails;

/**
 * Servlet implementation class ServletLibrarian
 */
@WebServlet("/ServletLibrarian")
public class ServletLibrarian extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLibrarian() {
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
		 ServiceLibrarian ser=new ServiceLibrarian();
		 String target="";
		 String str="";
		 int n;
		
		String button=request.getParameter("c1");
		try
		{
			 if(button.equals("DISPLAY"))
				{
					ArrayList<LibrarianDetails> al=ser.display();
					sn.setAttribute("s1", al);

					 target+="DisplayLibrarian.jsp";
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
