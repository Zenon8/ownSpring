package ua.rd.ioc;

/**
 * Created by Maksym_Petrenko on 9/7/2017.
 */
public interface Config {

    BeanDefinition[] beanDefinitions();
    BeanDefinition[] EMPTY_BEANDEFINITIONS = new BeanDefinition[0];

}
