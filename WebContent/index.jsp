<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Food Ordering Application</title>
</head>
<body>
<form action="ProcessLogin" method="post">
<input type="text" placeholder="E-mail" id="email" name="email" required>
<input type="password" placeholder="Password" id="password" name="password" required>
<input type="submit" name="submit" id="button" value="Login">
</form>

<a href="register.jsp">Create account</a>


</body>
</html>