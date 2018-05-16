package ua.com.shtramak.spring4pro.helloworld;

public class HelloMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello from ConsoleMessageProvider";
    }
}