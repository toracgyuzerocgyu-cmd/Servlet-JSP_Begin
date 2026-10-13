<%-- リスト10-3の状態 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="model.User" %>
<%
// セッションスコープに保存されたユーザー情報を取得
User loginUser = (User) session.getAttribute("loginUser");
if(loginUser == null)loginUser = new User("","");
//セッションスコープにユーザー情報がある場合取得後削除
else session.removeAttribute("loginUser");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>どこつぶ</title>
</head>
<body>
<h1>どこつぶへようこそ</h1>
<form action="Login" method="post">
ユーザー名：<input type="text" name="name" value="<%= loginUser.getName() %>"><br>
パスワード：<input type="password" name="pass" value="<%= loginUser.getPass() %>"><br>
<input type="submit" value="ログイン">
</form>
</body>
</html>