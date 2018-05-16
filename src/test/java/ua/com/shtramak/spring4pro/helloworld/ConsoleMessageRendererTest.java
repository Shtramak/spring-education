package ua.com.shtramak.spring4pro.helloworld;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsoleMessageRendererTest {
    private static ApplicationContext context;
    private MessageRenderer messageRenderer;
    private ByteArrayOutputStream outputStream;
    private static PrintStream original;

    @BeforeClass
    public static void setup() {
        context = new ClassPathXmlApplicationContext("/spring4pro/helloworld/context.xml");
        original = System.out;
    }

    @AfterClass
    public static void tearDown() {
        System.setOut(original);
    }

    @Before
    public void initMessageRenderer() {
        outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        messageRenderer = context.getBean("messageRenderer", MessageRenderer.class);
    }

    @Test
    public void test() {
        messageRenderer.renderMessage();
        String expected = "Hello from ConsoleMessageProvider" + System.lineSeparator();
        assertEquals(expected, outputStream.toString());
    }
}
