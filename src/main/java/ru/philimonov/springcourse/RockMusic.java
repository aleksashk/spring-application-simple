package ru.philimonov.springcourse;

import org.springframework.stereotype.Component;


public class RockMusic implements Music {
    public String getSong() {
        return "Wind cries Mary";
    }
}
