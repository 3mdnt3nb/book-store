package com.js.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.js.dao.BookCRUD;
@WebServlet(value="/delete")

public class DeleteBook extends HttpServlet {
	{
		System.out.println("hai");
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int ob1 = Integer.parseInt(req.getParameter("id"));
		
		BookCRUD bc = new BookCRUD();
		int ob3=bc.deleteBookbyID(ob1);
		
		if(ob3>0) {
			RequestDispatcher ob2 = req.getRequestDispatcher("pmk");
			ob2.forward(req, resp);

		}
		else {
			RequestDispatcher ob2 = req.getRequestDispatcher("result.jsp");
			req.setAttribute("msg","NO BOOK WITH THE GIVEN ID AVAILABLE");
			ob2.forward(req, resp);
		}
	}

}
