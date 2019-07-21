package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.Util.Util;


import Bean.IssueDetails;

public class DaoIssue {

	Connection con;
	String cmd="";
	java.sql.Date sdate1;
	java.sql.Date sdate2;
	 PreparedStatement ps;
	 ResultSet rs;
	 int n;
	 
 public boolean insert(IssueDetails obj) throws Exception
	 
	 {
		 
		 con=Util.getConnection();
			cmd ="insert into issuedetails values(?,?,?,?,?,?,?,?,?,?)";
		    ps=con.prepareStatement(cmd);
		    ps.setString(1, obj.getStudentId());
		    ps.setString(2, obj.getStudentName());
		    ps.setString(3, obj.getBranch());
		    ps.setString(4, obj.getSection());
		    ps.setString(5, obj.getEmail());
		    ps.setString(6,obj.getRollno());
		    ps.setString(7, obj.getBookno());
		    ps.setString(8, obj.getBookName());
		    sdate1=new java.sql.Date(obj.getIssueDate().getTime());// java date converted into sql date
		    ps.setDate(9, sdate1);
		     sdate2=new java.sql.Date(obj.getDueDate().getTime());// java date converted into sql date
		     ps.setDate(10,sdate2);
		   
		  n=ps.executeUpdate();
		    ps.close();
		    if(n>0)
		    return true;
		    else
		    	return false;
	 }
	 

}
