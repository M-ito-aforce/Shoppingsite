<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="../WEB-INF/header.html" %>
  <form action="login-in" method ="post">
  <!-- form actionでサーブレットを指定する -->
    ID:<input type="text" name ="MEMBER_id">
    パスワード:<input type="text" name ="PASSWORD"><br>
    <input type="submit" value="ログイン" >
    <input type="submit" value="新規会員登録" >
  </form>
  
  <%@include file="../WEB-INF/footer.html" %>
 