package com.js.controller;

import java.util.ArrayList;

import com.js.dao.BookCRUD;
import com.js.dto.Book;

public class GetAllBooks {
	public static void main(String[] args) {
		BookCRUD obj=new BookCRUD();
//		ArrayList<Book> allbook = obj.getAllBooks();
		ArrayList<Book> a=obj.getAllBooks();

		if(a.size()>0) {
			for(Book b:a) {
				System.out.println(b);
				System.out.println("==============================================================================");
			}
			
		}
		else {
			
		}
		
	}

}
