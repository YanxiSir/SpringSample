package com.yanxisir.hook;

import org.springframework.context.ApplicationEvent;

/**
 * @author: YanxiSir
 * @Date: 2020/4/29
 * @Sign: 心中田间，木行水上
 */
public class YxApplicationEvent extends ApplicationEvent {

    public YxApplicationEvent(Object source) {
        super(source);
    }
}
