package com.Service;

import com.Dao.DaoReturn;

import Bean.ReturnDetails;

public class ServiceReturn {

	
	
	public boolean insert(ReturnDetails s) throws Exception
	{
		
		DaoReturn d=new DaoReturn();
		boolean b=d.insert(s);
		return b;
	}
}
