<%@page import="com.js.dto.Book"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
h1 {
	color: red;
}
</style>

</head>
<body>
	<h1>
		<marquee behavoir="scroll" direction="right" scrollamount="	30">
			ALL THE BOOKS IN THE LIBRARY</marquee>
	</h1>
	<!--  <marquee behavoir="scroll" direction="right" scrollamount="	30"> -->
	<table style="border-color: chartreuse;" border="2px ">

		<tr>
			<th>Number</th>
			<th>Book_Name</th>
			<th>Author</th>
			<th>Pages</th>
			<th>Price</th>
			
		</tr>
		<%
			ArrayList<Book> ob1 = (ArrayList)request.getAttribute("name");
			for (Book b : ob1) {
		%>
		<tr>
			<td><%=b.getBook_id() %></td>
			<td><%=b.getBook_name() %></td>
			<td><%=b.getAuthor_name() %></td>
			<td><%=b.getNo_of_pages() %></td>
			<td><%=b.getPrice() %></td>
			<td><a href="delete?id=<%=b.getBook_id()%>">delete</a></td>
			<td><a href="update1?id=<%=b.getBook_id()%>">edit</a></td>

		</tr>
		<%}%>
	</table>
	</marquee>

	<a href="welcome.html"> GO BACK TO HOME</a>
</body>
</html>