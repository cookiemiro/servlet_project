package com.ssg.todo;

import com.ssg.todo.domain.TodoVO;
import com.ssg.todo.service.TodoService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;

@WebServlet(name = "todoRegisterController", urlPatterns = "/todo/register")
public class TodoRegisterController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("입력화면 register.jsp 로 GET");
//        request 객체에서 제공하는 getRequestDispatcher 메서드 이용
        RequestDispatcher dispatcher = req.getRequestDispatcher("/todo/register.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("입력을 처리하고 목록 페이지 이동");
        String title = req.getParameter("title");
        String date = req.getParameter("date");

        TodoVO newVo = TodoVO.builder()
                        .title(title)
                                .dueDate(Date.valueOf(date).toLocalDate())
                                        .finished(false)
                                                .build();
        try {
            TodoService.INSTANCE.register(newVo);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        resp.sendRedirect("/todo/list");
    }
}
