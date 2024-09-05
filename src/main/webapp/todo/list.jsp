<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="com.ssg.todo.dto.TodoDTO" %><%--
  Created by IntelliJ IDEA.
  User: a
  Date: 2024-09-04
  Time: 오후 5:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
</head>
<body>
    <h1>Todo List page</h1>
    <ul>
        <c:forEach var="dto" items="${dtolist}">
            <li><a href="/todo/read?tno=${dto.tno}">${dto.tno}</a> ${dto.title} ${dto.dueDate} ${dto.finished ? "DONE" : "NOT YET"}</li>
        </c:forEach>
    </ul>
</body>
</html>
