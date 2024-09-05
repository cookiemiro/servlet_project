package com.ssg.todo.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.ssg.todo.controller.TodoRegisterController.todoList;

@WebServlet(name = "todoListController", value = "/todo/list")
public class TodoListController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("todo_list", todoList);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/todo/list.jsp");
        dispatcher.forward(req, resp);

    }
}
