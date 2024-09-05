package com.ssg.todo.controller;

import com.ssg.todo.dto.Todo;
import org.springframework.stereotype.Component;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//@WebServlet(name = "todoRegisterController", value = "/todo/register")
public class TodoRegisterController extends HttpServlet {

    static List<Todo> todoList = new ArrayList<>();
    static int id = 1;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/todo/register.jsp");
        dispatcher.forward(req, resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = req.getParameter("title");
        String date = req.getParameter("date");

        Todo todo = new Todo(title, date);
        todo.setId(id++);
        todoList.add(todo);

//        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/todo/list.jsp");
//        dispatcher.forward(req, resp);

        resp.sendRedirect("/todo/list");
    }
}
