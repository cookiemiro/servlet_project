<%--
  Created by IntelliJ IDEA.
  User: a
  Date: 2024-09-04
  Time: 오후 5:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
    <style>
        input[type="text"] {
            display: block;
        }

        input[type="date"] {
            display: block;
        }
    </style>
</head>
<body>
    <form action="/todo/register" method="post">
        <input type="text" name="title" placeholder="INSERT TITLE">
        <input name="date" type="date">
        <button type="reset">RESET</button>
        <button type="submit">REGISTER</button>
    </form>
</body>
</html>
