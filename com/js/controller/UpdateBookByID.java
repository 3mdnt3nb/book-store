package com.js.controller;
import com.js.dao.BookCRUD;
import com.js.dto.Book;
public class UpdateBookByID {

		public static void main(String[] args) {
			Book b=new Book();
			b.setBook_id(1);
			b.setBook_name("oops");
			b.setAuthor_name("jockey");
			b.setNo_of_pages(300);
			b.setPrice(800);
			
			BookCRUD bc = new BookCRUD();
			int re=bc.updateBookbyID(1, b);
			if(re>0) {
				System.out.println("updated succesfully");
			}
			else {
				System.out.println("not  updated ");
			}
			
		}

	}

