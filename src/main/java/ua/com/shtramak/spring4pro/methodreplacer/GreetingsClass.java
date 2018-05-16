package ua.com.shtramak.spring4pro.methodreplacer;

import org.springframework.context.support.GenericXmlApplicationContext;

public class GreetingsClass {
    public String sayHallo(String name) {
        return "Hello " + name + "!";
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext("/spring4pro/methodreplacer/context.xml");
        GreetingsClass greetingsClass = context.getBean("greetingsClass", GreetingsClass.class);
        System.out.println(greetingsClass.sayHallo("Dude")); //Expected "Hello Dude!" but replaced with "Bye Dude!"
    }
}
