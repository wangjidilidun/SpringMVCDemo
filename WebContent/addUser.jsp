<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="../js/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
function addUser(){
	var form = document.forms[0];
	form.action = "/springMVC3/data/addUser";
	form.method = "get";
	form.submit();
}
	
	
</script>
</head>
<body>
	<h1>添加用户</h1>
	<form action="" >
		姓名：<input type="text" name="Name">
		年龄：<input type="text" name="age">
		<input type="submit" value="提交" onclick="addUser()">
	</form>
</body>
</html>