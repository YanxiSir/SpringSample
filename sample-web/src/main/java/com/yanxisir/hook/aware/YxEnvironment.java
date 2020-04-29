package com.yanxisir.hook.aware;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @author: YanxiSir
 * @Date: 2020/4/29
 * @Sign: 心中田间，木行水上
 */
@Component
public class YxEnvironment implements EnvironmentAware {
    @Override
    public void setEnvironment(Environment environment) {
    }
}
