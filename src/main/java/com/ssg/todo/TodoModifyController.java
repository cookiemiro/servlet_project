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


@WebServlet(name = "todoModifyController", urlPatterns = "/todo/modify")
public class TodoModifyController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long tno = Long.parseLong(req.getParameter("tno"));

        TodoVO vo;

        try {
            vo = TodoService.INSTANCE.get(tno);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        req.setAttribute("dto", vo);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/todo/modify.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String tno = req.getParameter("tno");
        String title = req.getParameter("title");
        String date = req.getParameter("date");
        String input = req.getParameter("check_box");
        System.out.println(input);

        TodoVO newVo = TodoVO.builder()
                .tno(Long.parseLong(tno))
                .title(title)
                .dueDate(Date.valueOf(date).toLocalDate())
                .finished(Boolean.parseBoolean(input))
                .build();

        try {
            TodoService.INSTANCE.update(newVo);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        resp.sendRedirect("/todo/list");
    }
}
