package demo.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @description: 一定要写注释啊
 * @date: 2018-11-16 17:58
 * @author: 十一
 */
@Service
@FeignClient("eureka-client")
public interface DcClient {

    @GetMapping("/dc")
    String consumer();

}

