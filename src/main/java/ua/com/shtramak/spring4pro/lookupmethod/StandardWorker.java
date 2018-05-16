package ua.com.shtramak.spring4pro.lookupmethod;

public class StandardWorker implements Workable {
    private MyHelper helper;

    public void setHelper(MyHelper helper) {
        this.helper = helper;
    }

    @Override
    public MyHelper getMyHelper() {
        return helper;
    }

    @Override
    public void doHelperJob() {
        helper.doImportantStuff();
    }
}
