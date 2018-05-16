package ua.com.shtramak.spring4pro.collectionsxmlinject;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class CollectionsInject {
    @Resource(name = "property")
    private Properties properties;
    @Resource(name = "map")
    private Map<String, String> map;
    @Resource(name = "set")
    private Set<String> set;
    @Resource(name = "list")
    private List<String> list;

    public Properties getProperties() {
        return properties;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public Set<String> getSet() {
        return set;
    }

    public List<String> getList() {
        return list;
    }
}
