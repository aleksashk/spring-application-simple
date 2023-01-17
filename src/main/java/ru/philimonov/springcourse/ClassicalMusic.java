package ru.philimonov.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component

public class ClassicalMusic implements Music {

    @PostConstruct
    public void doInit(){
        System.out.println("doing initialization!!!");
    }

    @PreDestroy
    public void doDestroy(){
        System.out.println("doing destruction!!!");
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
