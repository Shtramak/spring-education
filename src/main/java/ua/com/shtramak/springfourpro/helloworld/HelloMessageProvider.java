package ua.com.shtramak.springfourpro.helloworld;

public class HelloMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello from ConsoleMessageProvider";
    }
}