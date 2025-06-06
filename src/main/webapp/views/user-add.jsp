<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
<meta charset="UTF-8">
<title>新規会員登録</title>
</head>
<body>
<h1>新規会員登録</h1>
<form action="user-add-confirm.jsp" method ="post">
ユーザーID:<input type ="text" name = "MEMBER_id" required>半角英数字<br>
パスワード:<input type ="password" name = "PASSWORD" required>半角英数字<br>
名前(姓):<input type ="text" name = "LAST_NAME" required><br>
名前(名):<input type ="text" name = "FIRST_NAME" required><br>
メールアドレス:<input type ="email" name = "EMAIL" required><br>
住所：<input type ="text" name = "ADDRESS" ><br>
<input type="submit" value="確認" ><br>
<!--  <input type="submit" value="リセット" ><br>-->
<a href = "login-in.jsp" >ログイン画面へ戻る</a>
</form>
</body>
</html>