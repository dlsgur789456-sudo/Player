<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> <!DOCTYPE html> <html>
<head>
<meta charset="UTF-8">
<title>선수 등록</title>
</head>
<body>

	<h1>선수 등록</h1>

	<form action="/player/add" method="post">

		<div>
			<label>이름</label>
			<input type="text" name="name">
		</div>

		<div>
			<label>등번호</label>
			<input type="number" name="backnumber">
		</div>

		<div>
			<label>포지션</label>
			<input type="text" name="position">
		</div>

		<button type="submit">등록</button>

	</form>

	<a href="/player/list">선수 목록</a>

</body>
</html>
