package ua.com.shtramak.borisov.quoter;

public class SenatorClayQuoter implements Quoter {
    private String message;

    @Override
    public void sayQuote() {
        System.out.println("Message: " + message);
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
