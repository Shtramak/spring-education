package ua.com.shtramak.borisov.quoter;

public class ProfilingController implements  ProfilingControllerMBean{
    private boolean isEnabled=true;

    public boolean isEnabled() {
        return isEnabled;
    }

    @Override
    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }
}
