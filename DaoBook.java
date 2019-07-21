package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.Util.Util;

import Bean.BookDetails;




public class DaoBook {

	
	Connection con;
	String cmd="";
	 PreparedStatement ps;
	 ResultSet rs;
	 int n;
	 
	 
	 public boolean insert(BookDetails obj) throws Exception
	 
	 {
		 
		 con=Util.getConnection();
			cmd ="insert into bookdetails values(?,?,?,?,?,?,?)";
		    ps=con.prepareStatement(cmd);
		    ps.setString(1, obj.getBookName());
		    ps.setString(2, obj.getBookNo());
		    ps.setString(3, obj.getAuthorName());
		    ps.setString(4, obj.getPublisherName());
		    ps.setString(5, obj.getQuantity());
		    ps.setString(6,obj.getEdition());
		    ps.setString(7, obj.getPrice());
		  n=ps.executeUpdate();
		    ps.close();
		    if(n>0)
		    return true;
		    else
		    	return false;
	 }
	 
	 
	 public int delete( String bookno)throws Exception
		{
			con= Util.getConnection();
			cmd="delete from bookdetails where bookno=?";
			ps=con.prepareStatement(cmd);
			
			ps.setString(1,bookno);
			
			 n= ps.executeUpdate();
			 ps.close();
			 return n;
			
		}
	 
	 
	 public BookDetails search(String bookno) throws Exception
		{
			 SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
			con=Util.getConnection();
			cmd="select * from bookdetails where bookno=?";
			ps=con.prepareStatement(cmd);
			ps.setString(1,bookno);
			rs=ps.executeQuery();
			if(rs.next())
			{
				 String name=rs.getString(1);
		    	String no = rs.getString(2);
		    	String authorname = rs.getString(3);
		    	String publishername = rs.getString(4);
		    	String quantity = rs.getString(5);
		    	String edition = rs.getString(6);
		    	String price = rs.getString(7);
		    	BookDetails sb = new BookDetails(name,no,authorname,publishername,quantity,edition,price);
	             rs.close();
	             ps.close();
	             return sb;
		   }
			else
			{
				return null;
			}
		}
	 
	 
	 public ArrayList display() throws Exception
	 {
	 	    con=Util.getConnection();
	 	    ArrayList<BookDetails> al= new ArrayList<BookDetails>();
	 		cmd="select * from bookdetails";
	 		ps=con.prepareStatement(cmd);
	 		rs=ps.executeQuery();
	 		while(rs.next())
	 		{
	 			 String name=rs.getString(1);
	 	    	 String no=rs.getString(2);
	 	    	 String authorname=rs.getString(3);
	 	    	 String publishername =rs.getString(4);
	 	    	 String quantity=rs.getString(5);
	 	    	 String edition=rs.getString(6);
	 	    	 String price=rs.getString(7);
	 	    	  	 
	        BookDetails sb= new BookDetails(name,no,authorname,publishername,quantity,edition,price);
	             al.add(sb);
	 		}
	 	         return al;
	 	
	 }
	 
	 
	 
	 public int modify(String bookno,BookDetails e) throws Exception
	 {

	 	con=Util.getConnection();
	 	cmd="update bookdetails set bookname=? , authorname=? , publishername=? , quantity=? , edition=? , price=? where bookno=?";
	 	 ps=con.prepareStatement(cmd);
	      ps.setString(1,e.getBookName());
	 	 ps.setString(2,e.getAuthorName());
	 	 ps.setString(3,e.getPublisherName());
	 	 ps.setString(4,e.getQuantity());
	 	 ps.setString(5,e.getEdition());
	 	 ps.setString(6,e.getPrice());
	 	 ps.setString(7,bookno);
	      n=ps.executeUpdate();
	 	 ps.close();  
	      return n;
	      
	 	
	 }
	 
	 

	 
	 
}
