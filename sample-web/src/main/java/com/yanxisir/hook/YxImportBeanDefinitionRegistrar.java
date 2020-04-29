package com.yanxisir.hook;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

/**
 * @author: YanxiSir
 * @Date: 2020/4/29
 * @Sign: 心中田间，木行水上
 */
@Slf4j
@Component
public class YxImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar, EnvironmentAware {

    @Override
    public void setEnvironment(Environment environment) {
        log.info("Environment. JAVA_HOME:{}", environment.getProperty("JAVA_HOME"));
    }

    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {

    }
}
