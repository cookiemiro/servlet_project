package com.ssg.todo;

import com.ssg.todo.domain.TodoVO;
import com.ssg.todo.service.TodoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "todoReadController", urlPatterns = "/todo/read")
public class TodoReadController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("todo/read........ 실행");

        // /todo/read?tno=1
        Long tno = Long.parseLong(req.getParameter("tno"));
        TodoVO dto;
        try {
            dto = TodoService.INSTANCE.get(tno);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        req.setAttribute("dto", dto);
        req.getRequestDispatcher("/todo/read.jsp").forward(req, resp);
    }
}
