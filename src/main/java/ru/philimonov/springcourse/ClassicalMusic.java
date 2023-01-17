package ru.philimonov.springcourse;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Hungarian rhapsody";
    }

    public void doMyInit() {
        System.out.println("doing initialization!!!");
    }

    public void doMyDestroy() {
        System.out.println("doing destruction!!!");
    }
}
