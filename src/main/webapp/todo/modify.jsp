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
    <h1>Modify Page</h1>
    <form action="/todo/modify?tno=${dto.tno}" method="post">
        <input class="input_id" type="text" name="tno" value=${dto.tno} disabled>
        <input type="text" name="title" value=${dto.title}>
        <input type="date" name="date" value=${dto.dueDate}>
        <input class="check_input" type="checkbox" name="check_box" value=true checked=${dto.finished}>
<%--        <c:choose>--%>
<%--            <c:when test="${dto.finished}">--%>
<%--                <input class="check_input" type="checkbox" name="check_box" value="true">--%>
<%--            </c:when>--%>
<%--            <c:otherwise>--%>
<%--                <input class="check_input" type="checkbox" name="check_box" value="false">--%>
<%--            </c:otherwise>--%>
<%--        </c:choose>--%>
        <button type="submit">Modify</button>
    </form>

    <form action="/todo/remove?tno=${dto.tno}" method="post">
        <input class="hide second_input" type="text" name="id" disabled>
        <button class="button" type="submit">Remove</button>
    </form>
    <script>
        let input_id = document.querySelector(".input_id");
        let second_input = document.querySelector(".second_input");
        let button = document.querySelector(".button");
        let check_input = document.querySelector(".check_input");

        check_input.addEventListener("click", checkedFunc)

        button.addEventListener("click", eventFunc);

        function checkedFunc() {
            if (check_input.getAttribute("checked")) {
                check_input.setAttribute("checked", true);
                check_input.value = "true";
            } else {
                check_input.removeAttribute("checked");
                check_input.value = "false";
            }
        }

        function eventFunc() {
            second_input.textContent = input_id.value;
        }




    </script>
</body>
</html>
