<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" isELIgnored="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<html>
<head>
    <title>success</title>
</head>
<body>
    <h3>Success Page...</h3>

    <%-- 注意：添加isELIgnored="true"忽略el表达式不建议使用 --%>
    <c:set var="info" scope="session" value="HelloWorld"/>
    *_*：<c:out value="${sessionScope.info}" default="errorInfo" />

    <br />

    ^_^：<c:out value="${requestScope.msg}" default="errorInfo" />

    <br />

    msg属性值：${msg}
</body>
</html>
