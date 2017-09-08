package ua.rd.ioc;


public interface Config {

    BeanDefinition[] beanDefinitions();
    BeanDefinition[] EMPTY_BEANDEFINITIONS = new BeanDefinition[0];

}
