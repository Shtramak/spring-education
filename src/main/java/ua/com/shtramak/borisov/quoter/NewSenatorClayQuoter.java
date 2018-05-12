package ua.com.shtramak.borisov.quoter;

public class NewSenatorClayQuoter extends SenatorClayQuoter implements Quoter{
    @Override
    @PostProxy
    public void sayQuote() {
        System.out.println("Shiiiiet Boy! We are in NewSenatorClayQuoter class");
    }
}
