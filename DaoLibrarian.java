package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.Util.Util;

import Bean.BookDetails;
import Bean.LibrarianDetails;

public class DaoLibrarian {

	
	Connection con;
	String cmd="";
	 PreparedStatement ps;
	 ResultSet rs;
	 int n;
	 
	 
	 public ArrayList display() throws Exception
	 {
	 	    con=Util.getConnection();
	 	    ArrayList<LibrarianDetails> al= new ArrayList<LibrarianDetails>();
	 		cmd="select * from loginlibrarian";
	 		ps=con.prepareStatement(cmd);
	 		rs=ps.executeQuery();
	 		while(rs.next())
	 		{
	 			 String name=rs.getString(1);
	 	    	 String email=rs.getString(2);
	 	    	  	 
	        LibrarianDetails sb= new LibrarianDetails(name,email);
	             al.add(sb);
	 		}
	 	         return al;
	 	
	 }
	 
}
