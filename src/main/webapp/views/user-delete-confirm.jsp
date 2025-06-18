<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="user" class="jp.co.aforce.beans.UserBean" scope="session" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>会員情報削除</title>
</head>
<body>
<h1>削除してよろしいですか？</h1>

<label for= "LAST_NAME" ><jsp:getProperty name="user" property="LAST_NAME" /></label>
<label for= "FIRST_NAME" ><jsp:getProperty name="user" property="FIRST_NAME" /></label>さん<br>

<form action="user-Delete" method="post">
<input type = "submit" value ="はい"><br>
</form>
<a href="user-menu.jsp">会員メニュー画面へ戻る</a>
</body>
</html>