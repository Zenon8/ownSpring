package ua.rd.ioc;

/**
 * Created by Maksym_Petrenko on 9/7/2017.
 */
public interface Context {
    Object getBean(String beanName);
    String[] getBeanDefinitionNames();
}
