<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
<title>账户登录</title>
</head>
<body>
<form method="post">
<label for="account">账户</label>
<input id="account" name="account">
<label for="password">密码</label>
<input id="password" name="password" type="password">
<button type="submit">登录</button>
</form>
</body>
</html>