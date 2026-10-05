<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "ex.Fruit" %>
<% Fruit fruit = (Fruit)request.getAttribute("str"); %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>ex07_02</title>
</head>
<body>
	<p><%= fruit.getName() %>の値段は<%= fruit.getPrice() %>円です。</p>
</body>
</html>