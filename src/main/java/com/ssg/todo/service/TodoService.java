package com.ssg.todo.service;

import com.ssg.todo.dao.TodoDAO;
import com.ssg.todo.domain.TodoVO;
import com.ssg.todo.dto.TodoDTO;

import java.time.LocalDate;
import java.util.List;

public enum TodoService {
    INSTANCE;

    TodoDAO dao = new TodoDAO();

    // 글 하나를 등록하는 기능
    public void register(TodoVO vo) throws Exception {
        System.out.println("DEBUG............." + vo);

        dao.insert(vo);
    }

    // 등록된 글 목록을 반환하는 기능
    public List<TodoVO> getList() throws Exception {
        return dao.selectAllList();

    }

    public TodoVO get(Long tno) throws Exception {
        TodoVO vo = dao.selectOne(tno);

        return vo;
    }

    public void update(TodoVO vo) throws Exception {
        dao.updateOne(vo);
    }

    public void delete(Long tno) throws Exception {
        dao.deleteOne(tno);
    }
}
