package ru.philimonov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Music music = ctx.getBean("musicBean", Music.class);
        MusicPlayer player = new MusicPlayer(music);
        player.playMusic();
        ctx.close();
    }
}
