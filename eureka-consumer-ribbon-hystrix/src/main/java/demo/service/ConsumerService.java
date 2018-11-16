package demo.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @description: 一定要写注释啊
 * @date: 2018-11-16 20:03
 * @author: 十一
 */
@Service
public class ConsumerService {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 如果超时@HystrixCommand(fallbackMethod = "fallback")就去执行这个方法
     * @return
     */
    @HystrixCommand(fallbackMethod = "fallback")
    public String consumer() {
        return restTemplate.getForObject("http://eureka-client/dc", String.class);
    }

    public String fallback() {
        return "fallback";
    }
}
