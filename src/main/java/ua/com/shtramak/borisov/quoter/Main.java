package ua.com.shtramak.borisov.quoter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/quoter/context.xml");
        while (true) {
            Thread.sleep(300);
            context.getBean(Quoter.class).sayQuote();
        }
    }
}
