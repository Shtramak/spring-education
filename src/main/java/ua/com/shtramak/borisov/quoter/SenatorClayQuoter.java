package ua.com.shtramak.borisov.quoter;

import javax.annotation.PostConstruct;

@Profiling
public class SenatorClayQuoter implements Quoter {
    @InjectRandomInt(min = 2, max = 7)
    private int repeat;
    private String message;

    public SenatorClayQuoter() {
        System.out.println("Phase 1");
        System.out.println("Number of repeats:" + repeat);
    }

    @PostConstruct //with this annotation that method recognized as init method for BeanPostProcessor
    private void printRepeat(){
        System.out.println("Phase 2");
        System.out.println("Number of repeats:" + repeat);
    }

    @Override
    @PostProxy
    public void sayQuote() {
        System.out.println("Phase 3");
        for (int i = 0; i < repeat; i++) {
            System.out.println("Senator Clay say: " + message);
        }
    }

    public void setMessage(String message) {
        this.message = message;
    }
}