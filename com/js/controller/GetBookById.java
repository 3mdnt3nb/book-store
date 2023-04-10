package com.js.controller;

import com.js.dao.BookCRUD;
import com.js.dto.Book;

public class GetBookById {
	public static void main(String[] args) {
		BookCRUD BC=new BookCRUD();
	
		Book b=BC.getBookById(1);
		if(b!=null) {
			System.out.println(b);
		}
		else {
			System.out.println("not book is present with given id");
		}
	}

}
