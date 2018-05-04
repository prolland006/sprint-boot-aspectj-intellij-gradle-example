package com.testswing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public final class Launcher {

    public static void sayHi() {
        System.out.println("hello!");
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringContext.class);
        MetierProfiler metierProfiler = (MetierProfiler) context.getBean("metierProfiler");
        MainFrame mainFrame = (MainFrame) context.getBean("mainFrame");
        mainFrame.setArgs(args);
        mainFrame.init();
        Launcher.sayHi();
        new HelloWorld().sayHi();
    }
}