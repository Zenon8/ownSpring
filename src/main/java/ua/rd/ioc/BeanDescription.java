package ua.rd.ioc;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
public class BeanDescription {
    private String id;
    private String name;
    private String className;
    private String initMethod;
    private String destroyMethod;
    private LinkedHashMap<Class<?>, Object> constrArg = new LinkedHashMap<>();
    private Map<String, Object> properties = new HashMap<>();


    public BeanDescription(String id, String name, String className) {

        if (className == null) {
            throw new IllegalArgumentException("No specify a class type");
        }

        if (id == null) {
            this.id = (name == null) ? String.valueOf(hashCode()) : name.toLowerCase();
        }
        this.id = id;
        this.className = className;
    }
}
