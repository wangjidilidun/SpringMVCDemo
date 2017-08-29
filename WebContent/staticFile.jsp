<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="../js/jquery-3.2.1.min.js"></script>
<title>Insert title here</title>
<script type="text/javascript">
	$(document).ready(function(){
		//alert("fuck");
	});
</script>
</head>
<body>
	<h>${msg}</h>
	<br>
	<img alt="image" src="../img/IMG_4768.JPG" width = 800 height = 600>
	<form action="/springMVC3/anno/addUser" method="post">
		<input type="submit" value="post request">
	</form>
</body>
</html>