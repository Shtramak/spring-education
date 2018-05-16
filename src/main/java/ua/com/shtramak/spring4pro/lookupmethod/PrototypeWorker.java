package ua.com.shtramak.spring4pro.lookupmethod;

public abstract class PrototypeWorker implements Workable{

    @Override
    public abstract MyHelper getMyHelper();

    @Override
    public void doHelperJob() {
        getMyHelper().doImportantStuff();
    }
}
