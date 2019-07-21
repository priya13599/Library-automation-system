package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.Util.Util;

import Bean.ReturnDetails;

public class DaoReturn {

	
	

	Connection con;
	String cmd="";
	java.sql.Date sdate1;
	java.sql.Date sdate2;
	java.sql.Date sdate3;
	 PreparedStatement ps;
	 ResultSet rs;
	 int n;
	 
 public boolean insert(ReturnDetails obj) throws Exception
	 
	 {
		 
		 con=Util.getConnection();
			cmd ="insert into returndetails values(?,?,?,?,?,?,?,?,?,?,?,?)";
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
		     sdate3=new java.sql.Date(obj.getReturnDate().getTime());// java date converted into sql date
		     ps.setDate(11,sdate3);
		     ps.setString(12, obj.getFine());
		  n=ps.executeUpdate();
		    ps.close();
		    if(n>0)
		    return true;
		    else
		    	return false;
	 }
	 

}
