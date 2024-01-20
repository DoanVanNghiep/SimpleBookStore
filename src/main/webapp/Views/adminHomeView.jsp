<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang kết quả</title>
</head>
<body>
	<h2>Welcome, admin</h2>
	<p style="color: red;">${errors}</p>
	<div align = "center">
		<h3>Danh sách các cuốn sách</h3>
		
		<p style="color:red;">${erros}</p>
		<form  id="deleteBookFromAdminForm" method="post" action="deleteBook">
			<input type="hidden" name="bookId" id="deleteBookFromAdmin">
		</form>
		<table border="1">
			<tr>
				<th>Tiêu đề</th>
				<th>Tác giả</th>
				<th>Giá tiền</th>
				<th colspan="2" width="120px">Thao tác</th>
			</tr>
			<c:forEach items ="${bookList}" var="book">
				<tr>
					<td>${book.title}</td>
					<td>${book.author}</td>
					<td><fmt:formatNumber type="number" maxFractionDigits="0" value="${book.price}"></fmt:formatNumber></td>
					<td align="center">
						<button type="button" onclick="">Sửa</button>
					</td>
						<td align="center">
						<button type="button" onclick="onClickDeleteBook('${book.title}',${book.bookId});">Xóa</button>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<!-- Hàm gọi khi bấm xóa sách trên trang chủ quản trị -->
	<script type="text/javascript">
		function onClickDeleteBook(bookTitle, bookId){
			let c = confirm('Bạn chắc chắn muốn xóa cuốn sách "' + bookTitle +'"?');
			if(c){
				document.getElementById("deleteBookFromAdmin").value = bookId;
				document.getElementById("deleteBookFromAdminForm").submit();
			}
		}
	</script>
</body>
</html>