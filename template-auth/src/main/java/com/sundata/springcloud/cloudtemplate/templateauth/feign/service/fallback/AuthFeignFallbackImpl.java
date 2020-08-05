package com.sundata.springcloud.cloudtemplate.templateauth.feign.service.fallback;

import com.sundata.springcloud.cloudtemplate.templateauth.feign.service.AuthFeignService;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: liwei
 * @create: 2020-08-03 13:37
 **/
@Component
public class AuthFeignFallbackImpl implements AuthFeignService {


    @Override
    public String hello(String name) {
        return "hello " + name + ", this is template-auth, but request error";
    }
}
