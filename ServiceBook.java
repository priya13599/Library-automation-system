package com.Service;

import java.util.ArrayList;

import com.Dao.DaoBook;


import Bean.BookDetails;


public class ServiceBook {

	public boolean insert(BookDetails s) throws Exception
	{
		
		DaoBook d=new DaoBook();
		boolean b=d.insert(s);
		return b;
	}
	
	
	

	public int delete( String bookno)throws Exception
	{
		DaoBook d=new DaoBook();
	   int n= d.delete(bookno);
		 if(n>0)
			 return 1;
		 else
			 return 0;
	}
	
	
	public BookDetails search(String bookno) throws Exception
	{
		DaoBook d=new DaoBook();
		BookDetails obj1=d.search(bookno);
		return obj1;
	}
	
	
	public ArrayList display() throws Exception
	{
		DaoBook d=new DaoBook();
		ArrayList<BookDetails> al=d.display();
		return al;
		
	}
	
	
	public int modify(String bookno,BookDetails s) throws Exception
	{
		DaoBook d=new DaoBook();
		int n=d.modify(bookno,s);
		return n;
	}
	
	
	
}
