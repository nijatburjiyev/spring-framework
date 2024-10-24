package org.example.proxy;

import org.example.model.Comment;
import org.springframework.stereotype.Component;

@Component("email")
public class EmailCommentNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: \n" + comment.getText()+"\n");
    }
}
