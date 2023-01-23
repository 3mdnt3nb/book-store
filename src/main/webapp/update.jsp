<%@page import="com.js.dto.Book"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<h1 align="center">ENTER DETAILS TO UPDATE</h1>

<% Book b = (Book) request.getAttribute("book"); %>

<body>
	<form action="update2">


		<table bgcolor="red" align="center">
			<tr>
				<td>BOOK ID :</td>
				<td><input type="number" name="id" value="<%=b.getBook_id()%>"
					readonly="readonly"></td>

			</tr>
			<tr>
				<td>BOOK NAME :</td>
				<td><input type="text" name="bookname"
					value="<%=b.getBook_name()%>"></td>
			</tr>
			<tr>
				<td>AUTHOR NAME :</td>
				<td><input type="text" name="authorname"
					value="<%=b.getAuthor_name()%>"></td>
			</tr>
			<tr>
				<td>NUMBER OF PAGES :</td>
				<td><input type="number" name="nop"
					value="<%=b.getNo_of_pages()%>"></td>
			</tr>
			<tr>
				<td>PRICE :</td>
				<td><input type="number" name="price" value="<%=b.getPrice()%>">
				</td>
			</tr>

			<tr>
				<td><input type="SUBMIT" value="pres here to update"></td>
			</tr>

			</form>
		</table>
</body>
</html>