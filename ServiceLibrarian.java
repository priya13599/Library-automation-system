package com.Service;

import java.util.ArrayList;


import com.Dao.DaoLibrarian;


import Bean.LibrarianDetails;

public class ServiceLibrarian {

	
	
	public ArrayList display() throws Exception
	{
		DaoLibrarian d=new DaoLibrarian();
		ArrayList<LibrarianDetails> al=d.display();
		return al;
		
	}
}
