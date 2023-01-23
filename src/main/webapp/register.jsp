<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<marquee behavoir="scroll" direction="right" scrollamount="	10">
		WELCOME TO BOOK STORE </marquee>

	<form action="prajwal" >

		<table >
			<tr>
				<td>BOOK ID :</td>
				<td><input type="number" name="id"></td>

			</tr>
			<tr>
				<td>BOOK NAME :</td>
				<td><input type="text" name="bookname"></td>
			</tr>
			<tr>
				<td>AUTHOR NAME :</td>
				<td><input type="text" name="authorname"></td>
			</tr>
			<tr>
				<td>NUMBER OF PAGES :</td>
				<td><input type="number" name="nop"></td>
			</tr>
			<tr>
				<td>PRICE :</td>
				<td><input type="number" name="price"></td>
			</tr>

			<tr>
				<td><input type="SUBMIT" value="save here"></td>
			</tr>

			</form>
		</table>
</body>
</html>