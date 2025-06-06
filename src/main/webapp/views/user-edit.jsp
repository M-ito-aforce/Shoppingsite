<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<jsp:useBean id="user" class="jp.co.aforce.beans.UserBean" scope="session" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>会員情報編集</title>
</head>
<body>
<h1>会員情報編集</h1>
<form action="user-edit" method="post">
名前（姓）：<input type="text" name="lastName" maxlength="50" required value='<jsp:getProperty name="user" property="LAST_NAME" />'><br>
名前(名):<input type="text" name="firstName" maxlength="50" required value='<jsp:getProperty name="user" property="FIRST_NAME" />'><br>
メールアドレス:<input type="email" name="email" maxlength="100" required value='<jsp:getProperty name="user" property="EMAIL" />'><br>
<input type="submit" value="確認"><br>
</form>
<a href="user-menu.jsp">会員メニュー画面へ戻る</a>
</body>
</html>
