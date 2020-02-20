package com.yanxisir.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: YanxiSir
 * @Date: 2020/2/20
 * @Sign: 心中田间，木行水上
 */
@RestController
@RequestMapping("/test")
public class TestController extends BaseController {

    @GetMapping("/test")
    public Object test() {
        return "i'm a test";
    }
}
