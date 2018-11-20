package com.wangxm.serivcefeign.hystrix;

import com.wangxm.serivcefeign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystrix implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name+",ERROR";
    }
}
