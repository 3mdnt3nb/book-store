package com.js.controller;

import com.js.dao.BookCRUD;

public class DeleteBookByID {
	public static void main(String[] args) {
		BookCRUD bc = new BookCRUD();
		int a=bc.deleteBookbyID(8);
		if(a>0) {
			System.out.println("book deleted successfully ");
		}
		else {
			System.out.println("book is not deleted ");
		}
		
//		boolean a=bc.deleteBookbyID(7);
//		if(true) {
//			System.out.println("book deleted successfully ");
//		}
//		else {
//			System.out.println("book is not deleted ");
//		}
	}

}
