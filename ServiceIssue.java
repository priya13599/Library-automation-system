package com.Service;

import com.Dao.DaoIssue;

import Bean.IssueDetails;

public class ServiceIssue {

	
	public boolean insert(IssueDetails s) throws Exception
	{
		
		DaoIssue d=new DaoIssue();
		boolean b=d.insert(s);
		return b;
	}
}
