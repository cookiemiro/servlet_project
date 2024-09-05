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
    <%
        Todo todo = (Todo) request.getAttribute("todo");
    %>
    <h1>Read Page</h1>

    <input type="text" name="id" value=<%=todo.getId()%>>
    <input type="text" name="title" value=<%=todo.getTitle()%>>
    <input type="date" name="date" value=<%=todo.getDate()%>>
    <input type="checkbox" checked>
    <a href="/todo/modify?id=<%=todo.getId()%>">Modify/Remove</a> <a href="/todo/list">List</a>

</body>
</html>
