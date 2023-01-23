package com.js.dao;

import com.js.dto.Book;

public class InsertBook {
	public static void main(String[] args) {
		Book b=new Book();
		b.setBook_id(5);
		b.setBook_name("gof");
		b.setAuthor_name("eshwar");
		b.setNo_of_pages(250);
		b.setPrice(900);
		
		BookCRUD bc = new BookCRUD();
		int a=bc.insertBook(b);
		if(a>0) {
			System.out.println("book insert ");
		}
		else {
			System.out.println("not inserted");
		}
	}

}
