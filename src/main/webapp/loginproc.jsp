<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test="${result}">
			<script>
				alert("로그인 성공");
				location.href = "login.mem";
			</script>
		</c:when>
		<c:otherwise>
			<script>
				alert("로그인 실패");
				location.href = "login.mem";
			</script>
		</c:otherwise>
	</c:choose>
</body>
</html>