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
    <title>Modify</title>
    <style>
        input {
            display: block;
        }
        .hide {
            visibility: hidden;
        }
    </style>
</head>
<body>
    <%
        Todo todo = (Todo) request.getAttribute("todo");
    %>
    <h1>Modify Page</h1>
    <form action="/todo/modify?id=<%=todo.getId()%>" method="post">
        <input class="input_id" type="text" name="id" value=<%=todo.getId()%> disabled>
        <input type="text" name="title" value=<%=todo.getTitle()%>>
        <input type="date" name="date" value=<%=todo.getDate()%>>
        <input type="checkbox" checked>
        <button type="submit">Modify</button>
    </form>

    <form action="/todo/remove?id=<%=todo.getId()%>" method="post">
        <input class="hide second_input" type="text" name="id" disabled>
        <input class="hide" type="checkbox" checked>
        <button class="button" type="submit">Remove</button>
    </form>
    <script>
        let input_id = document.querySelector(".input_id");
        let second_input = document.querySelector(".second_input");
        let button = document.querySelector(".button");

        button.addEventListener("click", eventFunc);

        function eventFunc() {
            second_input.textContent = input_id.value;
        }




    </script>
</body>
</html>
