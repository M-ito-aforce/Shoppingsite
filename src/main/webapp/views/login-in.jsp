<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%><%@ page import="jp.co.aforce.beans.UserBean" %>
<head>
<title>ログイン</title>
</head>

<body>
<h1>ログイン</h1>
<!-- viewのloginを指定している(相対パス) 
     form actionでURIにあるloginを指定する-->
<form action="login" method="post">
  ユーザーID:<input type="text" name="MEMBER_id" required ><br>
  <!--文字列を表示させないようにtypeをpasswordにする 
      サーブレットで使うためにnameを付けている-->
  パスワード:<input type="password" name="PASSWORD" required><br> 
  <input type="submit" value="ログイン"><br>
</form>
<!-- 会員登録していない場合は新規で登録してもらう -->
<a href="user-add.jsp">新規会員登録</a>
</body>