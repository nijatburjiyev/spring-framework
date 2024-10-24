package org.example.proxy;

import org.example.model.Comment;
import org.springframework.stereotype.Component;

@Component("push")
//@Qualifier("push") -> another way to specify specific class
public class CommentPushNotificationProxy implements CommentNotificationProxy{

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Push comment notification: \n" + comment.getText());
    }
}
