package ua.rd.ioc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BeanDescriptionConfigReader implements ConfigReader {

    private List<BeanDefinition> beanDefinitions = null;

    @Override
    public List<BeanDefinition> beanDefinitions() {

        if (beanDefinitions == null) {
            throw new NoBeanDefinitionException();
        }
        return beanDefinitions;
    }


    private void generateBeanDefinitionsByBeanDescriptions(List<BeanDescription> list) {

        beanDefinitions = new ArrayList<>();
        beanDefinitions.addAll(list.stream().map(this::generateBeanDefinition).collect(Collectors.toList()));

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

    private BeanDefinitionImpl generateBeanDefinition(BeanDescription beanDescription) {
        BeanDefinitionImpl beanDefinition = new BeanDefinitionImpl();
        beanDefinition.setId(beanDescription.getId());
        beanDefinition.setName(beanDescription.getName());
        beanDefinition.setClassName(beanDescription.getClassName());
        beanDefinition.setConstrArg(beanDescription.getConstrArg());
        beanDefinition.setProperties(beanDescription.getProperties());
        beanDefinition.setInitMethod(beanDescription.getInitMethod());
        beanDefinition.setDestroyMethod(beanDescription.getDestroyMethod());
        return beanDefinition;

    }
}
