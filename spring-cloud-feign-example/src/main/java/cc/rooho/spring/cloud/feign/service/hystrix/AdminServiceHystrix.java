package cc.rooho.spring.cloud.feign.service.hystrix;

import cc.rooho.spring.cloud.feign.service.AdminService;
import org.springframework.stereotype.Component;

@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String sayHi(String message) {
        return String.format("Hi，your message is : %s but request bad!", message);
    }
}
