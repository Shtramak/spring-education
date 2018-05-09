package ua.com.shtramak.borisov.quoter;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SenatorClayQuoterTest {
    private static PrintStream originalOut;
    private static OutputStream outputStream;

    @BeforeClass
    public static void setUp() {
        originalOut = System.out;
        outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
    }

    @AfterClass
    public static void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    public void sayQuoteFromContextXmlReturnsMessage() {
        //Path to context.xml for XmlBeanDefinitionReader to parse
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/quoter/context.xml");
        Quoter senatorClayQuoter = context.getBean(Quoter.class);
        senatorClayQuoter.sayQuote();
        String actual = outputStream.toString();
        assertTrue(actual != null);
    }
}
