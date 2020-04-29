package com.yanxisir.hook;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;

/**
 * @author: YanxiSir
 * @Date: 2020/4/29
 * @Sign: 心中田间，木行水上
 */
@Component
public class YxApplicationListener implements ApplicationListener<YxApplicationEvent> {
    @Override
    public void onApplicationEvent(YxApplicationEvent yxApplicationEvent) {
        // 监听器，监听 实现了ApplicationEvent的事件。
    }
}
