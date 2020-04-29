package com.yanxisir.service;

import com.yanxisir.service.fusing.FusingService;
import com.yanxisir.service.fusing.HystrixCommandHello;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: YanxiSir
 * @Date: 2020/2/26
 * @Sign: 心中田间，木行水上
 */
@Service
public class SampleService implements BeanNameAware {

    private String name;

    @Override
    public void setBeanName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
