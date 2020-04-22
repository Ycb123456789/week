<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.8.2.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
  <tr>
    <th>Id:</th>
    <th>${hero.hid}</th>
  </tr>
  <tr>
    <th>英雄:</th>
    <th>${hero.hname}</th>
  </tr>
  <tr>
    <th>阵营:</th>
    <th>${hero.cname}</th>
  </tr>
  <tr>
    <th>价格:</th>
    <th>${hero.price}</th>
  </tr>
  <tr>
    <th>状态:</th>
    <th>${hero.status}</th>
  </tr>
  <tr>
    <th>上线时间:</th>
    <th><fmt:formatDate value="${hero.uptime}"/></th>
  </tr>
</table>
<a href="queryAll">返回</a>
</body>
</html>