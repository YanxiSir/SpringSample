package com.yanxisir.hook.aware;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

/**
 * 可以在每个由Spring托管的bean实现，能获取beanName
 *
 * @author: YanxiSir
 * @Date: 2020/4/29
 * @Sign: 心中田间，木行水上
 */
@Component
public class YxBeanName implements BeanNameAware {

    @Override
    public void setBeanName(String s) {

    }
}
