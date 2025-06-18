<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="jp.co.aforce.beans.UserBean" %>
<%@ page import="jp.co.aforce.dao.UserDao" %>
<%@ page import="java.sql.*" %>

<%
  request.setCharacterEncoding("UTF-8");

  UserBean user = new UserBean();
  user.setMEMBER_id(request.getParameter("MEMBER_id"));
  user.setPASSWORD(request.getParameter("PASSWORD"));
  user.setLAST_NAME(request.getParameter("LAST_NAME"));
  user.setFIRST_NAME(request.getParameter("FIRST_NAME"));
  user.setEMAIL(request.getParameter("EMAIL"));
  user.setADDRESS(request.getParameter("ADDRESS"));

  UserDao dao = new UserDao();
  boolean success = false;

  try {
      success = dao.userAdd(user);
  } catch (Exception e) {
      e.printStackTrace(); // ログにエラー出力
  }
%>

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>新規登録完了</title>
</head>
<body>
<% if (success) { %>
  <h1>登録に成功しました！</h1>
  <a href="login-in.jsp">ログイン画面へ</a>
<% } else { %>
  <h1>登録に失敗しました。</h1>
  <a href="user-add.jsp">戻る</a>
<% } %>
</body>
</html>
