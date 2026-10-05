<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="gym.UseCache" %>
<% UseCache price = (UseCache)request.getAttribute("price"); %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>practice</title>
</head>
<body>
	<p><%= price.getName() %>様　ご利用</p>
	<p>ご利用地区：<%= price.getDistrict() %></p>
	<p>基本使用料（2時間）</p>
	
</body>
</html>