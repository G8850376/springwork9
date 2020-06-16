<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/6/4
  Time: 10:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>商品管理系统</title>
</head>
<body>
<form action="add" method="post">
    name:<input type="text" name="name"/>
    <br>
    age:<input type="text" name="age"/>
    <br>
    pwd:<input type="text" name="pwd"/>
    <br>
    <input type="submit" value="go">
</form>
</body>
</html>
