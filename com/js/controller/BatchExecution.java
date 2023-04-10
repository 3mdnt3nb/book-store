package com.js.controller;

import java.util.ArrayList;

import com.js.dao.BookCRUD;
import com.js.dto.Book;

public class BatchExecution {
	public static void main(String[] args) {
		ArrayList<Book> arr = new ArrayList<>();
		Book b = new Book();
		b.setBook_id(9);
		b.setBook_name("java 1.2");
		b.setAuthor_name("abhilash");
		b.setNo_of_pages(2500);
		b.setPrice(400);
		Book b1 = new Book();
		b1.setBook_id(10);
		b1.setBook_name("java 1.2");
		b1.setAuthor_name("abhilash");
		b1.setNo_of_pages(2500);
		b1.setPrice(400);
		Book b2 = new Book();
		b2.setBook_id(11);
		b2.setBook_name("java 1.2");
		b2.setAuthor_name("abhilash");
		b2.setNo_of_pages(2500);
		b2.setPrice(400);

		arr.add(b);
		arr.add(b1);
		arr.add(b2);
		BookCRUD BC = new BookCRUD();
		
//		boolean BO = BC.batchExecution(arr);
//		if (BO) {
//			System.out.println("done");
//		} else {
//			System.out.println("not done");
//		}
		
		
		if (BC.batchExecution(arr)) {
			System.out.println("done");
		} else {
			System.out.println("not done");
		}
	}

}
