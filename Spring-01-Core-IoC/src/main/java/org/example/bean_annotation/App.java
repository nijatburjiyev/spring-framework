package org.example.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class);

        FullTimeMentor ft = container.getBean(FullTimeMentor.class);
        PartTimeMentor pt = container.getBean("p1", PartTimeMentor.class);

        ft.createAccount();
        pt.createAccount();

    }

}
