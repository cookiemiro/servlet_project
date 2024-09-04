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

@WebServlet(name = "todoModifyController", urlPatterns = "/todo/modify")
public class TodoModifyController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");

        Todo todo = todoList.get(Integer.valueOf(id) - 1);
        req.setAttribute("todo", todo);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/todo/modify.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String title = req.getParameter("title");
        String date = req.getParameter("date");
        int index = Integer.valueOf(id) - 1;

        Todo todo = todoList.get(index);

        todo.setTitle(title);
        todo.setDate(date);

        todoList.set(index, todo);
        req.setAttribute("todo_list", todoList);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/todo/list.jsp");
        dispatcher.forward(req, resp);
    }
}
