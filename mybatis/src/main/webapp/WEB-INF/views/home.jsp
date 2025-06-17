<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String root = request.getContextPath();
	pageContext.setAttribute("root", root);
%>
<html>
<head>
	<meta charset="UTF-8">
	<title>메인화면</title>
</head>
<body>
	<h1>Spring X MyBatis</h1>
	<h3>게시판 프로젝트</h3>
	<a href="${root }/board/list ">게시판</a>
</body>
</html>
