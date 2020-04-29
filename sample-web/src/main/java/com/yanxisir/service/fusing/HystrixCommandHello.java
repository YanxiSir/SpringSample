package com.yanxisir.service.fusing;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;

/**
 * @author: YanxiSir
 * @Date: 2020/2/26
 * @Sign: 心中田间，木行水上
 */
public class HystrixCommandHello extends HystrixCommand<String> {

    private FusingService fusingService;

    public HystrixCommandHello(FusingService fusingService) {
        super(HystrixCommandGroupKey.Factory.asKey("hello"));
        this.fusingService = fusingService;
    }

    @Override
    protected String run() throws Exception {
        return fusingService.hystrix();
    }

    @Override
    protected String getFallback() {
        return "i'm hystrix fallback!";
    }
}
