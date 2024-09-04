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

@WebServlet(name = "todoRemoveController", urlPatterns = "/todo/remove")
public class TodoRemoveController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");

        todoList.remove(Integer.valueOf(id) - 1);
        req.setAttribute("todo_list", todoList);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/todo/list.jsp");
        dispatcher.forward(req, resp);
    }
}
