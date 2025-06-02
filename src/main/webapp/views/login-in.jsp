<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="../header.html" %>
  <form action="login" method ="post">
  <h1>ログイン画面</h1>
  <!-- form actionでサーブレットを指定する -->
    ID:<input type="text" name ="MEMBER_id">
    パスワード:<input type="password" name ="PASSWORD"><br>
    <input type="submit" value="ログイン" >
    <input type="submit" value="新規会員登録" >
  </form>
  
  <%@include file="../footer.html" %>