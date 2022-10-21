<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${root}/board/writeBoard" enctype="multipart/form-data" method="post">
		제목<input name = "subject"><br>
		내용<textarea name = "content"></textarea><br>
		파일<input type = "file" name = "upfile"><br>
		<input type = "submit" value = "글등록">
	</form>
</body>
</html>