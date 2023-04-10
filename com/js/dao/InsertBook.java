package com.js.dao;

import com.js.dao.BookCRUD;
import com.js.dto.Book;

public class InsertBook {
	public static void main(String[] args) {
		Book b=new Book();
		b.setBook_id(21);
		b.setBook_name("gomale");
		b.setAuthor_name("eajesh");
		b.setNo_of_pages(200);
		b.setPrice(500);
		
		BookCRUD bc = new BookCRUD();
//		int a=bc.insertBook(b);
	
		if(bc.insertBook(b)>0) {
			System.out.println("book insert ");
		}
		else {
			System.out.println("not inserted");
		}
	}

}
