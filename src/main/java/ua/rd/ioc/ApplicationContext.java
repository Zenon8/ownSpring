package ua.rd.ioc;

import ua.rd.ioc.exception.NoSuchBeanException;

import java.util.Arrays;
import java.util.List;


public class ApplicationContext implements Context {

    private List<BeanDefinition> beanDefinitions;
    private List<BeanFactory> beanPostProcessors;


    public ApplicationContext() {
        beanDefinitions = Config.EMPTY_BEANDEFINITIONS;//new BeanDefinition[0];

    }

    public ApplicationContext(ConfigReader config) {
        this.beanDefinitions = config.beanDefinitions();
        initIoc();
    }

    private void initIoc() {

        for (BeanDefinition beanDefinition : beanDefinitions) {

            BeanFactory beanFactory = new BeanFactory(beanDefinition);
        }
    }

    public Object getBean(String beanName) throws IllegalAccessException, InstantiationException {
        List<BeanDefinition> beanDefinitions =
                Arrays.asList(this.beanDefinitions);
        if (beanDefinitions.stream().map(BeanDefinition::getBeanName).anyMatch(n -> n.equals(beanName))) {
            // return new Object();
            BeanDefinition beanDefinition = null;
            return beanDefinition.getBeanType().newInstance();

        } else {

            throw new NoSuchBeanException();
        }

    }

    public String[] getBeanDefinitionNames() {
        String[] beanDefinitionNames = new String[beanDefinitions.length];
        for (int i = 0; i < beanDefinitions.length; i++) {
            beanDefinitionNames[i] = beanDefinitions[i].getBeanName();
        }
        return beanDefinitionNames;
    }
}
