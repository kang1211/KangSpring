<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>testInput</title>
</head>
<body>

	<form method="get" action="/Info">
		이름 : <input type="text" name="myName"> <br> 
		나이 : <input type="text" name="myAge"> <br>
		직업 : <input type="text" name="myJob"> <br>
		<button>작성</button>
	</form>

</body>
</html>
<style>
	input{
	width:200px;
	height:50px;
	border: 5px solid black
	margin: 10px auto;
	}
</style>