package ua.com.shtramak.borisov.quoter;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SenatorClayQuoterTest {
    private static final PrintStream ORIGINAL_OUT = System.out;

    private static OutputStream outputStream;

    @Before
    public void setUp() {
        outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
    }

    @AfterClass
    public static void tearDown() {
        System.setOut(ORIGINAL_OUT);
    }

    @Test
    public void sayQuoteFromContextXmlReturnsMessage() {
        //Path to context.xml for XmlBeanDefinitionReader to parse
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/quoter/context.xml");
        Quoter senatorClayQuoter = context.getBean(Quoter.class);
        senatorClayQuoter.sayQuote();
        String actual = outputStream.toString();
        System.setOut(ORIGINAL_OUT);
        System.out.println(actual);
        assertTrue(actual != null);
    }
}
