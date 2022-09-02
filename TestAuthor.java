package com.oops.pll;

import com.oops.bll.Author;

public class TestAuthor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Author a1 = new Author();
		Author a2 = new Author ("Ram","Kumar");
		Author a3 = new Author ("Ravi","Kumar","Python");
		
		System.out.println("First Name " + a1.getFirstName());
		System.out.println("Last Name " + a1.getLastName());
		System.out.println("Book Name " + a1.getBookName());
		System.out.println("**********************************");
		System.out.println("First Name " + a2.getFirstName());
		System.out.println("Last Name " + a2.getLastName());
		System.out.println("Book Name " +a2.getBookName());
		
		System.out.println("First Name " + a3.getFirstName());
		System.out.println("Last Name " + a3.getLastName());
		System.out.println("Book Name " +a3.getBookName());
		
		Author a4 = null;
		System.out.println("A4 : " +a4);
		
	}

}
