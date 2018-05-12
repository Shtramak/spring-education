package ua.com.shtramak.borisov.quoter;

import javax.annotation.PostConstruct;

@Profiling
@DeprecatedClass(newImpl = NewSenatorClayQuoter.class)
public class SenatorClayQuoter implements Quoter {
    @InjectRandomInt(min = 2, max = 7)
    private int repeat;
    private String message;

    public SenatorClayQuoter() {
        System.out.println("Phase 1 in SenatorClayQuoter");
        System.out.println("Number of repeats:" + repeat);
    }

    @PostConstruct //with this annotation that method recognized as init method for BeanPostProcessor
    private void printRepeat(){
        System.out.println("Phase 2 in SenatorClayQuoter");
        System.out.println("Number of repeats:" + repeat);
    }

    @Override
    @PostProxy
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("Senator Clay say: " + message);
        }
    }

    public void setMessage(String message) {
        this.message = message;
    }
}