<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="root" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
	<title>My Board Join</title>
	  <meta charset="utf-8">
	  <meta name="viewport" content="width=device-width, initial-scale=1">
	  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
	  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class = "container">
	<div class = "row justify-content-center">
		<div class = "col-lg-10 col-md-10 col-sm-12">
			<h2 class = "my-3 py-3 shadow-sm bg-light text-center">
				<mark class = "orange">회원가입</mark>
			</h2>
		</div>
		<div class = "col-lg-10 col-md-10 col-sm-12">
			<form action="" id = "form-join" method = "post">
				<div class = "mb-3">
					이름 : <input class="form-control" name = "userName">
				</div>
				<div class = "mb-3">
					ID : <input class="form-control" name = "userId">
				</div>
				<div class = "mb-3">
					Password : <input class="form-control" name = "userPw">
				</div>
				<button id = "btn-join" class = "btn btn-outline-primary mb-3">회원가입</button>
			</form>
		</div>
	</div>
</div>
	<script type="text/javascript">
		document.querySelector("#btn-join").addEventListener("click",function(){
			// 여기서 submit 처리를 하면 추가적인 이벤트를 처리할 수 있어서 위에 button tyoe 에 submit 주지 않았다.
			let form = document.querySelector("#form-join");
			form.setAttribute("action","${root}/user/join");
			form.submit();
		});
	</script>
</body>
</html>