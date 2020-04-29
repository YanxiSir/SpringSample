package com.yanxisir.hook.aware;

import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.stereotype.Component;

/**
 * @author: YanxiSir
 * @Date: 2020/4/29
 * @Sign: 心中田间，木行水上
 */
@Component
public class YxBeanClassLoader implements BeanClassLoaderAware {
    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {

    }
}
