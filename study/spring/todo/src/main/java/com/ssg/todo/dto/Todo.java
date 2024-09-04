package com.ssg.todo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Todo {
    private int id;
    private String title;
    private String date;

    public Todo(String title, String date) {
        this.title = title;
        this.date = date;
    }
}
