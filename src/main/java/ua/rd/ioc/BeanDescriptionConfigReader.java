package ua.allugard.ioc;

import java.util.List;

public class BeanDescriptionConfigReader implements Config {

    @Override
    public BeanDefinition[] beanDefinitions() {
        return new BeanDefinition[0];
    }

    private void createBeanDefinitionByBeanDescription(List<BeanDescription> list) {

//        Class<?> cls = null;
//
//        try {
//            cls = Class.forName(className);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//
//        try {
//            cls.getConstructor((Class<?>[]) arguments.keySet().toArray());
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        }
//
//
//        Object o = c.newInstance();
    }
}
