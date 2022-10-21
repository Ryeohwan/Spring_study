<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<div class="container mt-3">
  <h2>게시판 글 목록</h2> 
  
  <form action="" id="form-param">
      <button id="btn-mv-register">글쓰기</button>  
  </form>
         
  <table class="table table-hover">
    <thead>
      <tr>
        <th>글번호</th>
        <th>제목</th>
        <th>작성자</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${articles}" var="boardDto">
      <tr>
        <td>${boardDto.articleNo}</td>
        <td>${boardDto.subject}</td>
        <td>${boardDto.userId}</td>
      </tr>
    </c:forEach>

    </tbody>
  </table>
</div>

<script type="text/javascript">
    document.querySelector("#btn-mv-register").addEventListener("click",function(){
        let form = document.querySelector("#form-param");
        form.setAttribute("action","${root}/board/write");
        form.submit();
    });
</script>

</body>
</html>