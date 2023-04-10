package com.js.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.js.dto.Book;
import com.mysql.cj.jdbc.Driver;

public class BookCRUD {
	final static String path = "com.mysql.cj.jdbc.Driver";
	final static String address = "jdbc:mysql://localhost:3306/jdbc_newyear?user=root&password=Abc@123";
	static Connection c;

	public int insertBook(Book b) {
		try {
			Class.forName(path);
			c = DriverManager.getConnection(address);
			// dynamic method
			PreparedStatement ps = c.prepareStatement("insert into book values(?,?,?,?,?)");
			ps.setInt(1, b.getBook_id());
			ps.setString(2, b.getBook_name());
			ps.setString(3, b.getAuthor_name());
			ps.setInt(4, b.getNo_of_pages());
			ps.setDouble(5, b.getPrice());
			return ps.executeUpdate();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				c.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}
	
	public int deleteBookbyID(int id) {

		try {
			Class.forName(path);
			c = DriverManager.getConnection(address);
			PreparedStatement ps = c.prepareStatement("delete Book from book where book_id=?");
			ps.setInt(1,id);

			return ps.executeUpdate();

		} catch (ClassNotFoundException e) {
			// TODO: handle exception
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				c.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 0;
	}

	public int updateBookbyID(int id, Book b) {

		try {
			Class.forName(path);
			c = DriverManager.getConnection(address);
			PreparedStatement ps = c.prepareStatement(
					"update book set book_name=?,author_name=?,no_of_pages=?,price=? where book_id=?");
			ps.setString(1, b.getAuthor_name());
			ps.setString(2,b.getBook_name() );
			ps.setInt(3, b.getNo_of_pages());
			ps.setDouble(4, b.getPrice());
			ps.setInt(5, id);

			return ps.executeUpdate();

		} catch (ClassNotFoundException e) {
			// TODO: handle exception
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				c.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 0;
	}

//	public Book getBookById(int id_number) {
//		Book b = null;
//		try {
//			Class.forName(path);
//			c = DriverManager.getConnection(address);
//			PreparedStatement ps = c.prepareStatement("select book_name from book where book_id=?");
//			ps.setInt(1, id_number);
//			
//			ResultSet rs = ps.executeQuery(); // result database table takes controller to id.
//			if (rs.next()) {
//				b = new Book();
////				b.setBook_id(rs.getInt(1));
//				b.setBook_name(rs.getString(1));
////				b.setAuthor_name(rs.getString(3));
////				b.setNo_of_pages(rs.getInt(4));
////				b.setPrice(rs.getDouble(5));
//				return b;
//			} else {
//				return b;
//			}
//
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			try {
//				c.close();
//			} catch (Exception e2) {
//				// TODO: handle exception
//			}
//		}
//		return b;
//	}
 public Book getBookById(int id_number) {
	 try {
		Class.forName(path);
		c=DriverManager.getConnection(address);
		PreparedStatement ps=c.prepareStatement("select * from book where book_id=?");
		ps.setInt(1, id_number);
		 
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			Book b = new Book();
		b.setBook_id(rs.getInt(1));
		b.setBook_name(rs.getString(2));
		b.setAuthor_name(rs.getString(3));
		b.setNo_of_pages(rs.getInt(4));
		b.setPrice(rs.getDouble(5));
		return b;
		}
		else {
			return null;
		}
			
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 finally {
		try {
			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 
	return null;
	 
 }

	public ArrayList<Book> getAllBooks() {

		ArrayList<Book> allbook = new ArrayList<>();
		try {
			Class.forName(path);
			c = DriverManager.getConnection(address);
			PreparedStatement ps = c.prepareStatement("select * from book");
			ResultSet RS = ps.executeQuery();
			while(RS.next()) {
				Book B = new Book();
				B.setBook_id(RS.getInt(1));
				B.setBook_name(RS.getString(2));
				B.setAuthor_name(RS.getString(3));
				B.setNo_of_pages(RS.getInt(4));
				B.setPrice(RS.getDouble(5));

				allbook.add(B);
			}
			return allbook;

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				c.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;

	}

	public boolean batchExecution(ArrayList<Book> books) // It is used to take multiple objects at once
	{
		try {
			Class.forName(path);
			c = DriverManager.getConnection(address);
			PreparedStatement ps = c.prepareStatement("insert into book values(?,?,?,?,?)");
			for (Book bk : books) {
				ps.setInt(1, bk.getBook_id());
				ps.setString(2, bk.getBook_name());
				ps.setString(3, bk.getAuthor_name());
				ps.setInt(4, bk.getNo_of_pages());
				ps.setDouble(5, bk.getPrice());
				ps.addBatch(); // important to add  addBatch() is inbuilt method 
				
			}
			ps.executeBatch();
			return true;

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				c.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

}
