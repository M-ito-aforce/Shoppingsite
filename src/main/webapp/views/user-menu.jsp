<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.html" %>
<%@taglib prefix ="c" uri = "jakarta.tags.core" %>
<!-- LoginServletからuserという変数、
     UserBeanからLAST_NAMEを持ってきている -->
<p>こんにちは、 ${user.LAST_NAME } さん！</p>


  <a href = "user-edit.jsp" >修正</a><br>
  <a href = "user-delete-confirm.jsp" >削除</a><br>
  <!-- これを押下するとログイン画面に戻る -->
  <a href = "login-in.jsp" >ログアウト</a><br>
<%@include file="../footer.html" %>