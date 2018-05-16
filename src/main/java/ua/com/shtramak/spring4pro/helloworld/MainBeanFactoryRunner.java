package ua.com.shtramak.spring4pro.helloworld;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class MainBeanFactoryRunner {
    public static void main(String[] args) {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(new ClassPathResource("/spring4pro/helloworld/context.xml"));
        MessageRenderer renderer = factory.getBean(MessageRenderer.class);
        renderer.renderMessage();
    }
}
