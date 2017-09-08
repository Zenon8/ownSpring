package ua.rd.ioc;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Getter
@Setter
public class BeanDefinitionImpl implements BeanDefinition {

    private String id;
    private String name;
    private String beanType;
    private String initMethod;
    private String destroyMethod;
    private LinkedHashMap<Class<?>, Object> constrArg = new LinkedHashMap<>();
    private Map<String, Object> properties = new HashMap<>();


    @Override
    public String getBeanName() {
        return name;
    }

    @Override
    public Class<?> getBeanType() throws ClassNotFoundException {

        return Class.forName(beanType);
    }
}
