<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<title>문화행사</title>
<script>
	var result = '${msg}';
	if(result == 'SUCCESS'){
		alert("처리가 완료되었습니다.");
	}
</script>
</head>
<body>
	<table>
		<tr>
			<th>번호</th>
			<th>카테고리</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>최대인원수</th>
			<th>현제인원수</th>	
			<th>조회수</th>
		</tr>
		<tr>
		<c:forEach items="${list}" var="list">
		<tr>
 			<td>${list.num}</td>
 			<td>${list.category}</td>
 			<td><a href='/userLibrary/service/culture/read?num=${list.num}'>${list.title}</a></td>
			<td>${list.id}</td>
			<td><fmt:formatDate value="${list.writeDate}" pattern="yyyy-MM-dd"></fmt:formatDate></td>
			<td>${list.max}</td>
			<td>${list.now}</td>
			<td>${list.view}
		</tr>
		</c:forEach>
	</table>
<input type="button" value="글쓰기" onclick="location.href='write'">
</body>
</html>