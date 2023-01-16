package ru.philimonov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestBean bean = ctx.getBean("testBean", TestBean.class);
        System.out.println(bean.getName());
        ctx.close();
    }
}
