package com.yanxisir.hook;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Iterator;

/**
 * @author: YanxiSir
 * @Date: 2020/4/29
 * @Sign: 心中田间，木行水上
 */
@Slf4j
@Component
public class YxBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        log.info("调用了自定义的BeanFactoryPostProcessor " + beanFactory);
        Iterator it = beanFactory.getBeanNamesIterator();

        String[] names = beanFactory.getBeanDefinitionNames();
        // 获取了所有的bean名称列表
        for (int i = 0; i < names.length; i++) {
            String name = names[i];

            BeanDefinition bd = beanFactory.getBeanDefinition(name);
            log.info(name + " bean properties: " + bd.getPropertyValues().toString());
            // 本内容只是个demo，打印持有的bean的属性情况
        }
    }
}
