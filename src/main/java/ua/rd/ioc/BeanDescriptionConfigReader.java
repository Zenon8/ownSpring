package ua.rd.ioc;

import ua.rd.ioc.exception.NoBeanDefinitionException;

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
    }

    private BeanDefinitionImpl generateBeanDefinition(BeanDescription beanDescription) {
        BeanDefinitionImpl beanDefinition = new BeanDefinitionImpl();
        beanDefinition.setId(beanDescription.getId());
        beanDefinition.setName(beanDescription.getName());
        beanDefinition.setBeanType(beanDescription.getClassName());
        beanDefinition.setConstrArg(beanDescription.getConstrArg());
        beanDefinition.setProperties(beanDescription.getProperties());
        beanDefinition.setInitMethod(beanDescription.getInitMethod());
        beanDefinition.setDestroyMethod(beanDescription.getDestroyMethod());
        return beanDefinition;

    }
}