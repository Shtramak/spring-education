package ua.com.shtramak.springfourpro.helloworld;

public class ConsoleMessageRenderer implements MessageRenderer {
    private MessageProvider messageProvider;

    @Override
    public void renderMessage() {
        if (messageProvider==null){
            throw new RuntimeException("MessageProvider is not setuped");
        }
        String message = messageProvider.getMessage();
        System.out.println(message);
    }

    @Override
    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return messageProvider;
    }
}