<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.ssg.todo.dto.Todo" %><%--
  Created by IntelliJ IDEA.
  User: a
  Date: 2024-09-04
  Time: 오후 5:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Read</title>
    <style>
        input {
            display: block;
        }
    </style>
</head>
<body>
<%--    <%--%>
<%--        Todo todo = (Todo) request.getAttribute("todo");--%>
<%--    %>--%>
<%--    <h1>Read Page</h1>--%>

<%--    <input type="text" name="id" value=<%=todo.getId()%> diabled>--%>
<%--    <input type="text" name="title" value=<%=todo.getTitle()%>>--%>
<%--    <input type="date" name="date" value=<%=todo.getDate()%>>--%>
<%--    <input type="checkbox" checked>--%>
<%--    <a href="/todo/modify?id=<%=todo.getId()%>">Modify/Remove</a> <a href="/todo/list">List</a>--%>
<h1>Read Page</h1>

<input type="text" name="tno" value=${dto.tno} disabled>
<input type="text" name="title" value=${dto.title} disabled>
<input type="date" name="date" value=${dto.dueDate} disabled>
<c:choose>
    <c:when test="${dto.finished}">
        <input type="checkbox" checked disabled>
    </c:when>
    <c:otherwise>
        <input type="checkbox" disabled>
    </c:otherwise>
</c:choose>
<a href="/todo/modify?tno=${dto.tno}">Modify/Remove</a> <a href="/todo/list">List</a>


</body>
</html>
