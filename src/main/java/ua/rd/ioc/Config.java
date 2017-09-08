package ua.rd.ioc;


import java.util.List;

public interface Config {

    BeanDefinition[] beanDefinitions();
    List<BeanDefinition> EMPTY_BEANDEFINITIONS = new BeanDefinition[0];

}
