<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<title>Insert title here</title>
</head>
<body>

	<c:set var="REST_API_KEY" value="43ed9505b4defefd25e3f3077cfb14eb" />
	<c:set var="REDIRECT_URI" value="http://localhost:8090/myapp/kakaologintest.do" />
	<c:set var="LOGOUT_REDIRECT_URI" value="http://localhost:8090/myapp/kakaologintest.do" />
	
	<a href="https://kauth.kakao.com/oauth/authorize?client_id=${REST_API_KEY}&redirect_uri=${REDIRECT_URI}&response_type=code">
		<img src="images/kakao_login_medium_narrow.png" />
	</a>
	
	<a href="https://kauth.kakao.com/oauth/logout?client_id=${REST_API_KEY}&logout_redirect_uri=${LOGOUT_REDIRECT_URI}">
		<input type="button" value="로그아웃" />
	</a>
	
	<script>
		alert("login page loaded successfully!");
	</script>
</body>
</html>