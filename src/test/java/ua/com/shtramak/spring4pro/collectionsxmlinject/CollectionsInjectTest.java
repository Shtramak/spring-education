package ua.com.shtramak.spring4pro.collectionsxmlinject;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionsInjectTest {
    private static CollectionsInject collections;

    @BeforeClass
    public static void setUp() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring4pro/collectionsxmlinject/context.xml");
        collections = context.getBean(CollectionsInject.class);
    }

    @Test
    public void getPropertiesReturnsDataFromXml() {
        String expected = "{property-two=2, property-one=1}";
        Assert.assertEquals(expected, collections.getProperties().toString());
    }

    @Test
    public void getMapReturnsDataFromXml() {
        Map<String, String> expected = new HashMap<>();
        expected.put("map-two", "2");
        expected.put("map-one", "1");
        Map<String, String> actual = collections.getMap();
        assertTrue(expected.equals(actual));
    }

    @Test
    public void getSetReturnsDataFromXml() {
        Set<String> expected = new HashSet<>();
        expected.add("set-one");
        expected.add("set-two");
        Set<String> actual = collections.getSet();
        assertTrue(expected.equals(actual));
    }

    @Test
    public void getListReturnsDataFromXml() {
        List<String> expected = new ArrayList<>();
        expected.add("1");
        expected.add("2");
        List<String> actual = collections.getList();
        assertTrue(expected.equals(actual));
    }
}