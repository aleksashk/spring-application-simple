package ru.philimonov.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer player = ctx.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(player);
        ctx.close();
    }
}
