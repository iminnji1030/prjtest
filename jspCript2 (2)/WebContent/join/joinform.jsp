<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"  %> 
<%
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>joinform.jsp</h3>
<form action="memberjoinproc.do" method="post">
id : <input type="text" name="id" /> <br />
pw : <input type="text" name="pw" /> <br />
name : <input type="text" name="name" /> <br />
addr : <input type="text" name="addr" /> <br />

<input type="submit" value="send" />

</form>


</body>
</html>