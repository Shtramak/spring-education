package ua.com.shtramak.spring4pro.lookupmethod;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.StopWatch;

public class MainRunner {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("/spring4pro/lookupmethod/context.xml");
        context.refresh();
        Workable prototypeWorker = context.getBean("prototypeWorker", Workable.class);
        Workable standardWorker = context.getBean("standardWorker", Workable.class);
        System.out.println("Standard worker");
        printInfo(standardWorker);
        System.out.println("--------------------------");
        System.out.println("Prototype worker");
        printInfo(prototypeWorker);
    }

    private static void printInfo(Workable prototypeWorker) {
        MyHelper helper1 = prototypeWorker.getMyHelper();
        MyHelper helper2 = prototypeWorker.getMyHelper();
        System.out.println("MyHelper instances are the same? " + (helper1 == helper2));
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i = 0; i <10000 ; i++) {
            MyHelper helper = prototypeWorker.getMyHelper();
            helper.doImportantStuff();
        }
        stopWatch.stop();
        System.out.println("Milliseconds to handle 10000 invokes of helper.doImportantStuff(): " + stopWatch.getTotalTimeMillis());
    }
}
