<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.html" %>
<%@taglib prefix ="c" uri = "jakarta.tags.core" %>
<p>こんにちは、 ${user.LAST_NAME } さん！</p>

<input type ="submit" value ="修正" >
<input type ="submit" value ="削除" >
<input type ="submit" value ="ログアウト" >
<%@include file="../footer.html" %>