package ua.rd.ioc;

import java.util.Arrays;
import java.util.List;


public class ApplicationContext implements Context {
    private BeanDefinition[] beanDefinitions;

    public ApplicationContext(Config config) {
        this.beanDefinitions = config.beanDefinitions();
    }

    public ApplicationContext() {
        beanDefinitions =Config.EMPTY_BEANDEFINITIONS;//new BeanDefinition[0];

    }

    public Object getBean(String beanName) {
        List<BeanDefinition> beanDefinitions =
                Arrays.asList(this.beanDefinitions);
        if(beanDefinitions.stream().map(BeanDefinition::getBeanName).anyMatch(n -> n.equals(beanName))){
           // return new Object();
            BeanDefinition beanDefinition=null;
            try {
                return beanDefinition.getBeanType().newInstance();

            } catch (InstantiationException|IllegalAccessException  e) {
                e.printStackTrace();
            }
        }
        else {
            throw new NoSuchBeanException();
        }
    }

    public String[] getBeanDefinitionNames() {
        String [] beanDefinitionNames= new String[beanDefinitions.length];
        for (int i = 0; i <beanDefinitions.length ; i++) {
            beanDefinitionNames[i]= beanDefinitions[i].getBeanName();
        }
        return beanDefinitionNames;
    }
}
