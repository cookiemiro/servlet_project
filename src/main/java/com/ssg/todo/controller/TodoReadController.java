package com.ssg.todo.controller;

import com.ssg.todo.dto.Todo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.ssg.todo.controller.TodoRegisterController.todoList;

//@WebServlet(name = "todoReadController", urlPatterns = "/todo/read")
public class TodoReadController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");

        Todo todo = todoList.get(Integer.valueOf(id) - 1);
        req.setAttribute("todo", todo);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/todo/read.jsp");
        dispatcher.forward(req, resp);
    }
}
