<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录</title>
<!-- 加载Query文件-->
<script src="https://code.jquery.com/jquery-3.2.0.js"></script>

</head>
<body>
<h1>Welcome!</h1>

<h1>请登录：</h1>
    <!-- 根据你的需要改变请求url -->
	<form id="form" action="./login/login.do">
		<table>
			<tr>
				<td>用户名</td>
                <td><input id="username" name="username" value="" /></td>
			</tr>	
			<tr>
				<td>密码</td>
                <td><input id="password" name="password" value="" /></td>
			</tr>		
			<tr>
				<td></td>
				<td align="right"><input type="submit" value="提交" /></td>
			</tr>
		</table>
	</form>
</body>
</html>