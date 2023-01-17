package ru.philimonov.springcourse;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.philimonov.springcourse")
@PropertySource("classpath:player.properties")
public class SpringConfig {

}
