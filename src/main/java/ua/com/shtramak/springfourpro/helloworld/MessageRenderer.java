package ua.com.shtramak.springfourpro.helloworld;

public interface MessageRenderer {
    void renderMessage();
    void setMessageProvider(MessageProvider messageProvider);
    MessageProvider getMessageProvider();
}