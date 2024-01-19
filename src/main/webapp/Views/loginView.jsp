<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="login" method="post">
    	<% if (request.getParameter("error") != null) { %>
        <p style="color: red;">Invalid username or password!</p>
 		<% } %>
		<label for="username">Tài khoản</label><br> 
		<input type="text" name="username" id="username" required><br>
		<br> <label for="password">Mật khẩu</label><br> 
		<input type="password" name="password" id="password" required><br>
		<br> <input type="submit" value="Đăng nhập" > <a
			href="${pageContext.request.contextPath}/">Bỏ qua</a>
	</form>
</body>
</html>