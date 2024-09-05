package com.ssg.todo;

import com.ssg.todo.service.TodoService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet(name = "todoRemoveController", urlPatterns = "/todo/remove")
public class TodoRemoveController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String tno = req.getParameter("tno");

        try {
            TodoService.INSTANCE.delete(Long.parseLong(tno));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        resp.sendRedirect("/todo/list");
    }
}
