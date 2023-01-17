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
//
//        MusicPlayer player = ctx.getBean("musicPlayer", MusicPlayer.class);
//        player.playMusic();

//        Computer computer = ctx.getBean("computer", Computer.class);
//        System.out.println(computer);

        MusicPlayer player = ctx.getBean("musicPlayer", MusicPlayer.class);
        System.out.println("player name: " + player.getName());
        System.out.println("player volume: " + player.getVolume());

        Music classicalMusic1 = ctx.getBean("classicalMusic", Music.class);
        Music classicalMusic2 = ctx.getBean("classicalMusic", Music.class);
        System.out.println("classicalMusic2==classicalMusic1 - " + (classicalMusic2==classicalMusic1));
        ctx.close();
    }
}
