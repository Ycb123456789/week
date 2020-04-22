<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.8.2.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<%=request.getContextPath() %>/css/css.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
<form action="queryAll" method="post">
	英雄阵营:<select name="cid">
	<option value="">请选择</option>
	<c:forEach items="${clist}" var="a">
		<option value="${a.cid}" <c:if test="${map.cid==a.cid}">checked='checked'</c:if>>${a.cname }</option>
	</c:forEach>
</select>
状态:<select name="status">
	<option value="">请选择</option>
	<option value="1"<c:if test="${map.status==1}">checked=checked</c:if>>已拥有</option>
	<option value="0" <c:if test="${map.status==0}">checked=checked</c:if>>未拥有</option>
</select>
价格:<input type="text" name="min">~<input type="text" name="max">
<input type="submit" value="查询">
<a href="add.jsp"><input type="button" value="新增"></a>
</form>
<table>
  <tr>
  	<th></th>
    <th>ID</th>
    <th>英雄</th>
    <th>阵营</th>
    <th>价格</th>
    <th>状态</th>
    <th>上线时间</th>
    <th>操作</th>
  </tr>
  <c:forEach items="${plist.list}" var="u">
  	<tr>
  	<td><input type="checkbox" value="${u.hid }"></td>
    <td>${u.hid }</td>
    <td>${u.hname }</td>
    <td>${u.cname}</td>
    <td>${u.price}</td>
    <td>${u.status==0?"未拥有":"已拥有"}</td>
    <td>
    	<fmt:formatDate value="${u.uptime}"/>
    </td>
    <td>
    <a href="queryOne?hid=${u.hid}"><input type="button" value="详情"></a>
    
    <a href="update.jsp?hid=${u.hid }"><input type="button" value="购买"></a>
    </td>
  </tr>
  </c:forEach>
  <tr>
  	<td colspan="10">
  		<a href="?pageNum=1">首页</a>
  		<a href="?pageNum=${plist.pageNum-1<1?plist.pageNum:plist.pageNum-1}">上一页</a>
  		<a href="?pageNum=${plist.pageNum+1>plist.pages?plist.pageNum:plist.pageNum+1}">下一页</a>
  		<a href="?pageNum=${plist.pages}">尾页</a>
  		当前为${plist.pageNum}/${plist.pages}页
  	</td>
  </tr>
</table>
</body>
<script type="text/javascript">
	function buy(hid){
		$.post("update",{"hid":hid},function(back){
			if(back){
				alert("购买成功");
				location.href="queryAll";
			}else{
				alert("购买失败");
			}
		})
	}
</script>
</html>