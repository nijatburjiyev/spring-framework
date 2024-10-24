package org.example;

import org.example.config.ConfigApp;
import org.example.model.Comment;
import org.example.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunApp {
    public static void main(String[] args) {
        Comment comment = new Comment();
        comment.setAuthor("Stephen King");
        comment.setText("From legendary storyteller and master of short fiction");

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class);

        CommentService cs1 = container.getBean(CommentService.class);
        CommentService cs2 = container.getBean(CommentService.class);

        System.out.println(cs1 == cs2);





    }
}
