package com.yanxisir.service.fusing;

import org.springframework.stereotype.Service;

/**
 * @author: YanxiSir
 * @Date: 2020/2/26
 * @Sign: 心中田间，木行水上
 */
@Service
public class FusingService {

    public String hystrix() {
        return "hello hystrix";
    }

    public String sentinel() {
        return "hello sentinel";
    }
}
