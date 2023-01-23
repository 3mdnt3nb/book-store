package com.js.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.js.dao.BookCRUD;
import com.js.dto.Book;

@WebServlet(value = "/pmk")
public class ViewAllBooks extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		BookCRUD ob1 = new BookCRUD();
		ArrayList<Book> ob2 = ob1.getAllBooks();
		if (ob2.isEmpty()) {
			RequestDispatcher ob3 = req.getRequestDispatcher("result.jsp");
			req.setAttribute("msg", "NO BOOKS AVAILABLE");
			ob3.forward(req, resp);
		} else {
			RequestDispatcher ob3 = req.getRequestDispatcher("viewall.jsp");
			req.setAttribute("name", ob2);
			ob3.forward(req, resp);
		}
	}
}
