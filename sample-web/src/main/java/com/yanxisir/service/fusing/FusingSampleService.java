package com.yanxisir.service.fusing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: YanxiSir
 * @Date: 2020/2/26
 * @Sign: 心中田间，木行水上
 */
@Service
public class FusingSampleService {

    @Autowired
    private FusingService fusingService;

    public String sampleHystrix() {
        return new HystrixCommandHello(fusingService).execute();
    }

    public String sampleSentinel() {
        return "";
    }
}
