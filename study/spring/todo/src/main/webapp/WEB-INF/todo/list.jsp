<%@ page import="java.util.List" %>
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
    <title>List</title>
</head>
<body>
    <h1>Todo List</h1>
    <%
        List<Todo> todoList = (List<Todo>) request.getAttribute("todo_list");

        for (int i = 0; i < todoList.size(); i++) {
    %>
        <a href="/todo/read?id=<%=todoList.get(i).getId()%>"><%=todoList.get(i).getId()%></a> <%=todoList.get(i).getTitle()%>  <%=todoList.get(i).getDate()%><br>
    <%
        }
    %>
</body>
</html>
