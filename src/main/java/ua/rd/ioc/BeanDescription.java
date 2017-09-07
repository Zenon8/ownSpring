package ua.rd.ioc;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Maksym_Petrenko on 9/7/2017.
 */
public class BeanDescription {
    private String idBean;
    private String classBean;

    private Map<Class<?>, Object> arguments= new LinkedHashMap<>();

}
