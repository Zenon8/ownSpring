package ua.rd.ioc;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BeanFactory {

    private BeanDefinition beanDefinition;

    public BeanFactory(BeanDefinition beanDefinition) {
        this.beanDefinition = beanDefinition;
    }

    public Object createBean() {

        Object obj = null;
        try {
             obj = callConstructor();

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        obj = initSetters(obj);

        return obj;
    }


    private Object callConstructor() throws IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<?> cls = null;

        try {
            cls = beanDefinition.getBeanType();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Constructor<?> constr = null;

        try {
            constr = cls.getConstructor((Class<?>[]) beanDefinition.getConstrArg().keySet().toArray());

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        return constr.newInstance(beanDefinition.getConstrArg().values());
    }


    private Object initSetters(Object obj) {
        return null;
    }
}

