package ua.com.shtramak.spring4pro.methodreplacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class ByeClass implements MethodReplacer {
    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        if (isValid(method)) {
            String message = (String) args[0];
            return "Bye " + message + "!";
        }else{
            throw new IllegalArgumentException("Smth goes wrong, bro!");
        }
    }

    private boolean isValid(Method method) {
        if (method.getParameterTypes().length != 1)
            return false;
        if (!"sayHallo".equals(method.getName()))
            return false;
        if (method.getReturnType() != String.class)
            return false;
        if (method.getParameterTypes()[0] != String.class)
            return false;
        return true;
    }


}
