<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/springMVC3/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$("#add").click(function(){
			var userName = $("#Name11").val();
			var age = $("#Age11").val();
			
			var user22 = {userName:userName, age:age};
			console.log(user22);
			$.ajax({
					url:"/springMVC3/data/addUserJson",
					type:"post",
					data:user22,
					success:function(data){
						alert(data.userName);
						console.log(data.userName);
					}
				});
			
		});
	});
</script>
</head>
<body>
	<h1>Json添加用户</h1>
	姓名：<input type="text" id="Name11" name="Name44">
	年龄：<input type="text" id="Age11" name="Age44">
	<input type="button" id="add" value="添加">
</body>
</html>