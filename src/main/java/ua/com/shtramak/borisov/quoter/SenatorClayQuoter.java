package ua.com.shtramak.borisov.quoter;

import javax.annotation.PostConstruct;

public class SenatorClayQuoter implements Quoter {
    @InjectRandomInt(min = 2, max = 7)
    private int repeat;
    private String message;

    @PostConstruct //with this annotation that method recognized as init method for BeanPostProcessor
    private void printRepeat(){
        System.out.println("Number of repeats:" + repeat);
    }

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
