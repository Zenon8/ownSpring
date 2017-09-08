package ua.rd.ioc;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public interface BeanDefinition {

    String getBeanName();

    Class<?> getBeanType() throws ClassNotFoundException;

    String getId();

    String getName();

    String getInitMethod();

    String getDestroyMethod();

    LinkedHashMap<Class<?>, Object> getConstrArg();

    Map<String, Object> getProperties();
}
