package ua.rd.ioc;

import java.util.List;
import java.util.Map;


/**
 * Created by Maksym_Petrenko on 9/7/2017.
 */
public class JavaMapConfig implements Config {
    private Map<String, Class<?>> beanDescriptions;
    public JavaMapConfig(Map<String, Class<?>> beanDescriptions) {
        this.beanDescriptions=beanDescriptions;
    }

    public BeanDefinition[] beanDefinitions(){
        BeanDefinition[]  beanDefinitions =
                beanDescriptions.entrySet().stream().map(Map.Entry::getValue)
                .toArray(BeanDefinition[]::new);
        return beanDefinitions;
    }

    /*private BeanDefinition beanDefinition(String name) {
        return new BeanDefinition() {
            @Override
            public String getBeanName() {
                return name;
            }

            @Override
            public Class<?> getBeanType() {
                return this.getClass();
            }
        };
    }*/
}
