package ua.rd.ioc;

import java.util.LinkedHashMap;
import java.util.Map;


public class BeanDescription {
    private String idBean;
    private String classBean;

    private Map<Class<?>, Object> arguments= new LinkedHashMap<>();

}
