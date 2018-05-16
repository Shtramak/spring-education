package ua.com.shtramak.spring4pro.helloworld;

public interface MessageRenderer {
    void renderMessage();
    void setMessageProvider(MessageProvider messageProvider);
    MessageProvider getMessageProvider();
}