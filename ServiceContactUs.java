package com.Service;

import com.Dao.DaoContactUs;

import Bean.ContactUsBean;

public class ServiceContactUs {

	
	public boolean insert(ContactUsBean s) throws Exception
	{
		DaoContactUs d=new DaoContactUs();
		boolean b=d.insert(s);
		return b;
	}
}
