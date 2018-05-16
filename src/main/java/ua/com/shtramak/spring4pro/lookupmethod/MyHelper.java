package ua.com.shtramak.spring4pro.lookupmethod;

import java.time.LocalDateTime;

public class MyHelper {
    private LocalDateTime created;

    public MyHelper() {
        created = LocalDateTime.now();
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void doImportantStuff() {
        Double result = Math.sqrt(created.getSecond());
        if(result!=0){
            //do nothing
        }
    }
}
