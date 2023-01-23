package com.js.httpsession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(value="/login2") // web.xml should be present implicitly mapping is happening
public class login2  extends HttpServlet{
	
//	String ob1 = req.getParameter("email");
//	int ob2 = Integer.parseInt(req.getParameter("password"));
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if (req.getParameter("email").equals("raj@gmail.com") && Integer.parseInt(req.getParameter("password")) == 123) {
			
//			HttpSession hs = req.getSession();
			 req.getSession().setAttribute("hai", "hello");
			
			
			RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
			rd.forward(req, resp);

		} else {
			PrintWriter pw = resp.getWriter();
			pw.write("<html><body> <h3> style= \"color:red\">EMAIL OR PASSWORD IS WRONG </h3></body></html>");
			RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
			rd.forward(req, resp);

		}
		
	}

}
