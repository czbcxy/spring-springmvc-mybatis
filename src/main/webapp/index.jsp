<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/head/head.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>springMVC</title>
<script>
	function r() {
		var username = document.getElementById("username");
		var pass = document.getElementById("password");
		if (username.value == "") {
			alert("请输入用户名");
			username.focus();
			return;
		}
		if (pass.value == "") {
			alert("请输入密码");
			return;
		}
		return true;
	}
</script>
</head>
<body>
	<center>
		<form action="/web/index.do" method="post">
			<table width="350" bgcolor="#ccffcc" style="" border="1">
				<tr align=center>
					<td>用户名</td>
					<td><input type="text" name="username" id="username"></td>
				</tr>
				<tr align=center>
					<td>密 码</td>
					<td><input type="password" name="password" id="password"></td>
				</tr>
				<tr align=center>
					<td colspan="2"><input type="submit" value="登 录"
						onclick="r();" /> <input type="reset" value="重 置" /></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>