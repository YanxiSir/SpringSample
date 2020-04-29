package com.yanxisir.hook.aware;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author: YanxiSir
 * @Date: 2020/4/29
 * @Sign: 心中田间，木行水上
 */
@Component
public final class YxApplicationContext implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(org.springframework.context.ApplicationContext applicationContext) throws BeansException {
        YxApplicationContext.applicationContext = applicationContext;
    }

    public static Object getBeanDefinition(String name) {
        return StringUtils.isBlank(name) ? null : applicationContext.getBean(name);
    }

    public static <T> T getBeanDefinition(String name, Class<T> clazz) {
        return StringUtils.isBlank(name) ? null : applicationContext.getBean(name, clazz);
    }
}
