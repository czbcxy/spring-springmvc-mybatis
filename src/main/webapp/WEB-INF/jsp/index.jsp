<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/head/head.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SpringMVC</title>
</head>
<body>
	<center>
		<h1>登陆成功</h1>
		<form action="/web/index" method="post">

			<table>
				<tr>
					<td>用户名</td>
					<td>用户密码</td>
					<td>年龄</td>
				</tr>
				<c:forEach items="${textTb }" var="textTb">
					<tr>
						<td>${textTb.username}</td>
						<td>${textTb.password}</td>
						<td>${textTb.age}</td>
					</tr>
				</c:forEach>
			</table>
		</form>
	</center>
</body>
</html>