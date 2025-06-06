<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%
String id = request.getParameter("MEMBER_id");
String password = request.getParameter("PASSWORD");
String lastname = request.getParameter("LAST_NAME");
String firstname = request.getParameter("FIRST_NAME");
String email = request.getParameter("EMAIL");
String address = request.getParameter("ADDRESS");
%>

<!DOCTYPE html>
<head>
<meta charset="UTF-8">
<title>登録内容確認</title>
</head>
<body>
  <h1>登録する内容はこちらでよろしいですか？</h1>
  <label for ="MEMBER_id" >ユーザーID:</label>
  <p>
    <%=id%>
  </p>
  
  <label for ="PASSWORD">パスワード:</label>
  <p>
    <%=password%>
  </p>
  
  <label for ="LAST_NAME" >名前(姓):</label>  
  <p>
    <%=lastname%>
  </p>
  
  <label for ="LAST_NAME" >名前(名):</label>
  <p>
    <%=firstname%>
  </p>
  
  <label for ="FIRST_NAME" ></label>
  <p>
    メールアドレス:<%=email%>
  </p>
  
  <label for ="ADDRESS" >住所：</label>
  <p>
    <%=address%>
  </p>
  
  <form action="register" method="post">
    <input type="hidden" name="MEMBER_id" value = <%=id%>><br> 
    <input type="hidden" name="PASSWORD" value = <%=password%>><br> 
    <input type="hidden" name="LAST_NAME" value = <%=lastname%>><br>
    <input type="hidden" name="FIRST_NAME" value = <%=firstname%>><br> 
    <input type="hidden" name="EMAIL" value = <%=email%>><br> 
    <input type="hidden" name="ADDRESS" value = <%=address%>><br>
    <input type="submit" value="登録"><br>
  </form>

  <a href = "user-add.jsp"></a>

</body>
</html>