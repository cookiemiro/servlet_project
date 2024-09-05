package com.ssg.todo;


import com.ssg.todo.domain.TodoVO;
import com.ssg.todo.service.TodoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "todoListController", urlPatterns = "/todo/list")
public class TodoListController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("/todo/list.......call");
        List<TodoVO> dtoList = null;
        try {
            dtoList = TodoService.INSTANCE.getList();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(dtoList.size());
        req.setAttribute("dtolist", dtoList);


        req.getRequestDispatcher("/todo/list.jsp").forward(req, resp);
    }
}
