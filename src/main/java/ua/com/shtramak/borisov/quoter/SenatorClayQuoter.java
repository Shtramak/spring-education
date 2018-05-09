package ua.com.shtramak.borisov.quoter;

public class SenatorClayQuoter implements Quoter {
    @InjectRandomInt(min = 4, max = 7)
    private int repeat;
    private String message;

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("Message: " + message);
        }
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
