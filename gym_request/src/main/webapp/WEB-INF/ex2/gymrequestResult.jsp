<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="model.Gym" %>
<%
// リクエストスコープに保存されたHealthを取得
Gym gym = (Gym) request.getAttribute("gym");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>体育館利用申請</title>
<style>
  .red{
    color: red;
  }
</style>
</head>
<body>
<h1>体育館の利用料金</h1>
<p><%= gym.getName() %>様　ご利用<br></p>
<p>ご利用地区：<%= gym.getArea() %></p>
<p>基本使用料（2時間）　2000円</p>
<p>
  夜間照明（1000円）：<%= gym.getYakan_req() %><br>
  ネット（300円）：<%= gym.getNet_req() %><br>
  ボール×10個（400円）：<%= gym.getBall_req() %><br>
  合計金額　<%= gym.getPrice() %>円
</p>
<p>以上の条件で承りました。</p>
<a href="RequestCheck">戻る</a>
</body>
</html>