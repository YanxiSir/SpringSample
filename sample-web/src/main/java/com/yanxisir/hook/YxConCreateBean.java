package com.yanxisir.hook;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author: YanxiSir
 * @Date: 2020/4/29
 * @Sign: 心中田间，木行水上
 */
@Slf4j
@Component
public class YxConCreateBean implements InitializingBean, DisposableBean {

    @Override
    public void destroy() throws Exception {
        log.info("--destroy-- 释放资源");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("--init-- 初始化资源");
    }
}
