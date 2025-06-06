<%@page import="jp.co.aforce.beans.UserBean"%>
<%@ page import="jp.co.aforce.UserBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <%
  //セッションを取得して破棄する
  UserBean users = (UserBean) session.getAttribute("users");
  if (session != null) {
  	session.invalidate();
  }

  //ログインページにリダイレクト(遷移)する
  response.sendRedirect("login-in.jsp");
  %>
</body>
</html>