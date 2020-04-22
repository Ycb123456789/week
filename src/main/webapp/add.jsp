<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.8.2.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<%=request.getContextPath() %>/css/css.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
<h1>新增</h1>
<form action="add" method="post">
	英雄:<input type="text" name="hname"><br>
	价格:<input type="text" name="price"><br>
	阵营:<select name="cid" id="cc">
		<option value="">请选择</option>
	</select><br>
	状态:<select name="status">
		<option value="">请选择</option>
		<option value="1">已拥有</option>
		<option value="0">未拥有</option>
	</select><br>
	<input type="submit" value="添加">
</form>
</body>
<script type="text/javascript">
	$.post("queryCamp",function(date){
		for ( var i in date) {
			$("#cc").append("<option value='"+date[i].cid+"'>"+date[i].cname+"</option>");
		}
	},"json");
</script>
</html>