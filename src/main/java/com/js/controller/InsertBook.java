package com.js.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.js.dao.BookCRUD;
import com.js.dto.Book;
@WebServlet(value="/prajwal")
public class InsertBook extends HttpServlet {
	//do post slow 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Book b=new Book();
		b.setBook_id(Integer.parseInt(req.getParameter("id")));
		b.setBook_name(req.getParameter("bookname"));
		b.setAuthor_name(req.getParameter("authorname"));
		b.setNo_of_pages(Integer.parseInt(req.getParameter("nop")));
		b.setPrice(Double.parseDouble(req.getParameter("price")));
		
		BookCRUD bc = new BookCRUD();
		int res=bc.insertBook(b);
		if(res>0) {
			RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
			req.setAttribute("msg", "INSERTED SUCESSFULLY ");
			rd.forward(req, resp);
			
		}
		else {
			RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
			req.setAttribute("msg", "BOOK DISPATCHED  ");
			rd.forward(req, resp);
			
		}
		
	}
	
}
