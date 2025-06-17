<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
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
	
	
	<!-- ✅ 로그인 사용자 환영 메시지 -->
	<c:if test="${not empty sessionScope.loginUser}">
		<p><strong>${sessionScope.loginUser.name}</strong>님 환영합니다!</p>
	</c:if>
	
	<a href="${root }/board/list ">게시판</a>
	<a href="${root }/join ">회원가입</a>
</body>
</html>
