<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String root = request.getContextPath();
    pageContext.setAttribute("root", root);
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>회원가입</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .error {
            color: red;
            font-size: 0.875em;
        }
    </style>
</head>
<body class="bg-light">
    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="card shadow-sm">
                    <div class="card-body">
                        <h3 class="card-title text-center mb-4">회원가입</h3>
                        
                        <form:form modelAttribute="user" method="post" action="${root}/join">
                            <div class="mb-3">
                                <label class="form-label">아이디</label>
                                <form:input path="username" cssClass="form-control"/>
                                <form:errors path="username" cssClass="error" />
                            </div>

                            <div class="mb-3">
                                <label class="form-label">비밀번호</label>
                                <form:password path="password" cssClass="form-control" />
                                <form:errors path="password" cssClass="error" />
                            </div>

                            <div class="mb-3">
                                <label class="form-label">이름</label>
                                <form:input path="name" cssClass="form-control"/>
                                <form:errors path="name" cssClass="error" />
                            </div>

                            <div class="mb-3">
                                <label class="form-label">이메일</label>
                                <form:input path="email" cssClass="form-control"/>
                                <form:errors path="email" cssClass="error" />
                            </div>

                            <div class="d-grid">
                                <button type="submit" class="btn btn-primary">회원가입</button>
                            </div>
                        </form:form>

                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
