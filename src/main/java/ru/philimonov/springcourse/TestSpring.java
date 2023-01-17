package ru.philimonov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Music music = ctx.getBean("musicBean", Music.class);
//        MusicPlayer player = new MusicPlayer(music);

        MusicPlayer player = ctx.getBean("musicPlayer", MusicPlayer.class);
        player.playMusic();
        System.out.println("player title is: " + player.getName());
        System.out.println("player volume is: " + player.getVolume());
        ctx.close();
    }
}
