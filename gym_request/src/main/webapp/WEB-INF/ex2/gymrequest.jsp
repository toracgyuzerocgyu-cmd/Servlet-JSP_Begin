<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>体育館の利用料金</title>
<style>
  body{
    padding: 0px 15px;
  }
  h1{
    border-bottom: solid 2px #000000;
    line-height: 1.2;
  }
  p{
    font-size: 20px;
  }
  #total{
    font-weight: bold;
  }
</style>
</head>

<body>
<h1>体育館の利用料金</h1>
<p>基本使用料（2時間）　2000円</p>
<form action="RequestCheck" method="post" onchange="checkSum();">
名前：<input type="text" name="name"><br>
ご利用地区：<select name="area">
	<option value="新宿区" selected="selected">新宿区</option>
	<option value="千代田区">千代田区</option>
	<option value="港区">港区</option>
	</select><br>
オプション料金：<br>
  <label><input type="checkbox" name="option" value=1000 id="c1">夜間照明（1000円）</label><br>
  <label><input type="checkbox" name="option" value=300 id="c2">ネット（300円）</label><br>
  <label><input type="checkbox" name="option" value=400 id="c3">ボール×10個（400円）</label>
<p>合計金額　<span id="total">2000円</span></p>
  <input type="submit" value="申請">
</form>

<script>
function checkSum() {
  let price = 2000;
  if(document.getElementById('c1').checked == true){
    price = price + 1000;
  }
  if(document.getElementById('c2').checked == true){
    price = price + 300;
  }
  if(document.getElementById('c3').checked == true){
    price = price + 400;
  }
  document.getElementById('total').textContent = price + '円';
}
</script>

</body>
</html>