<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form 받아오기</title>
</head>
<body>

	<form method="get" action="/input3">
		아이디 : <input type="text" name="myId"> <br> 
		이름 : <input type="text" name="myName"> <br>
		<button type="button" id="send">작성</button>
	</form>
	
	<a href="/input4/gubukson/이순신">이순신</a>
	<a href="/input4/samsung/이재용">이재용</a>

</body>
</html>