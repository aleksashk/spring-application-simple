package ru.philimonov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Music music = ctx.getBean("musicBean", Music.class);
//        MusicPlayer player = new MusicPlayer(music);

//        MusicPlayer player1 = ctx.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer player2 = ctx.getBean("musicPlayer", MusicPlayer.class);
//
//        System.out.println("player1 == player2: " + (player1 == player2));
//        System.out.println(player1);
//        System.out.println(player2);
//
//        player1.setVolume(10);
//        System.out.println(player1.getVolume());
//        System.out.println(player2.getVolume());

        Music music1 = ctx.getBean("classicalMusic", Music.class);
        System.out.println(music1.getSong());
        Music music2 = ctx.getBean("rockMusic", Music.class);
        System.out.println(music2.getSong());

        MusicPlayer player = new MusicPlayer(music2);
        player.playMusic();
        ctx.close();
    }
}
