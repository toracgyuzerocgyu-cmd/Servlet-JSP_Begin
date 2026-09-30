<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>練習5-2</title>
</head>
<body>
	<form action="testenq" method="post">
		名前：<br>
		<input type="text" name = "name"><br><br>
		お問い合わせの種類<br>
		<select name = "qtype">
			<option value = "company">会社について</option>
			<option value = "product">製品について</option>
			<option value = "support">アフターサポートについて</option>
		</select>
		<br><br>
		お問い合わせ内容：<br>
		<textarea name="body" rows="5" cols="33"></textarea><br>
		<input type="submit" value = "送信">
	</form>
</body>
</html>