<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> <!DOCTYPE html> <html>
<head>
<meta charset="UTF-8">
<title>선수 목록</title>
</head>
<body>

	<h1>선수 목록</h1>

	<table border="1">

		<tr>
			<th>이름</th>
			<th>등번호</th>
			<th>포지션</th>
			<th>관리</th>
		</tr>

		<c:forEach var="player" items="${list}">

			<tr>
				<td>${player.name}</td>
				<td>${player.backnumber}</td>
				<td>${player.position}</td>
				<td>
					<form action="/player/update" method="post" style="display: inline;">
						<input type="hidden" name="name" value="${player.name}">
						<button type="submit">수정</button>
					</form>

					<form action="/player/delete" method="post" style="display: inline;">
						<input type="hidden" name="name" value="${player.name}">
						<button type="submit">삭제</button>
					</form>
				</td>
			</tr>

		</c:forEach>

	</table>

	<br>

	<a href="/">돌아가기</a>

</body>
</html>
