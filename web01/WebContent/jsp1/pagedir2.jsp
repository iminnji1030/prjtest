<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Timestamp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
Timestamp now=new Timestamp(System.currentTimeMillis());
SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
String strDate=format.format(now);
String name="홍길동";
%>
<!--표현식 사용해 출력-->
<%=strDate %> <br/>
당신의 이름은 : <%=name %> </br>
그대의 이름은 : <%="홍길순"    %>
</body>

</html>