package com.yanxisir.hook;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author: YanxiSir
 * @Date: 2020/4/29
 * @Sign: 心中田间，木行水上
 */
@Service
public class YxBeanPostProcessor implements BeanPostProcessor {

    //bean初始化方法调用前被调用
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        return o;
    }

    //bean初始化方法调用后被调用
    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        return o;
    }
}
