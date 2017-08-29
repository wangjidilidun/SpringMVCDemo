<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="/springMVC3/css/select2.css" />
<link rel="stylesheet" href="/springMVC3/css/select2.min.css" />
<title>Insert title here</title>
<script type="text/javascript" src="/springMVC3/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="/springMVC3/js/select2.full.min.js"></script>
<script type="text/javascript">


var data = [{ id: 0, text: 'enhancement' }, { id: 1, text: 'bug' }, { id: 2, text: 'duplicate' }, { id: 3, text: 'invalid' }, { id: 4, text: 'wontfix' }];

$(document).ready(function(){
	$(".js-example-basic-multiple").select2({
		//data:data,
		placeholder:'请选择',
		multiple:true
	});
});

</script>
</head>

<body>
<select class="js-example-basic-multiple" multiple="multiple">
</select>
</body>
</html>