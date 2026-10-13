<%-- リスト10-17の状態 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="model.User,model.Mutter,java.util.List" %>
<%
// セッションスコープに保存されたユーザー情報を取得
User loginUser = (User) session.getAttribute("loginUser");
// アプリケーションスコープに保存されたつぶやきリストを取得
List<Mutter> mutterList =
(List<Mutter>) application.getAttribute("mutterList");
// リクエストスコープに保存されたエラーメッセージを取得
String errorMsg = (String) request.getAttribute("errorMsg");
%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
p{
font-size:16px;
}
.like_max {
font-size:24px;
color:#FF0000
}
.like_normal {
font-size:24px;
}
.dislike_normal {
font-size:12px;
color:#888888
}
.dislike_max {
font-size:12px;
color:#FFFFFF
}
.font_red {
color:red;
}
</style>
<meta charset="UTF-8">
<title>どこつぶ</title>
</head>
<body>
<h1>どこつぶメイン</h1>
<p>
<%=loginUser.getName()%>さん、ログイン中
<a href="Logout">ログアウト</a>
</p>
<p><a href="Main">更新</a></p>
<form action="Main" method="post">
<input type="text" name="text">
<input type="submit" value="つぶやく">
</form>
<%
if(errorMsg != null){
%>
<p class="font_red"><%=errorMsg%></p>
<%
}
%>
<%
// int i = mutterList.size()-1;
	int i = 0;
	int hantei;
	for(Mutter mutter : mutterList){
	  hantei = mutter.getLike() - mutter.getDislike();
	  if(hantei >= 20){
%>
<p class="like_max">
	  <%}else if(hantei >= 10){%>
<p class="like_normal">
	  <%}else if(hantei <= -20){%>
<p class="dislike_max">
	  <%}else if(hantei <= -10){%>
<p class="dislike_normal">
	  <%}else {%>
<p>
	  <%}%>
	  <%=mutter.getUserName()%>：<%=mutter.getText()%></p>
<p><a href="Main?like=<%= i %>">よいね</a><%= mutter.getLike() %>回　
<a href="Main?dislike=<%= i %>">よくないね</a><%= mutter.getDislike() %>回</p>
<%  	// i--;
	i++;
	} %>
</body>
</html>