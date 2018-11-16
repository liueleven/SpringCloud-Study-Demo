package demo.controller;

import demo.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @description: 一定要写注释啊
 * @date: 2018-11-16 17:32
 * @author: 十一
 */
@RestController
public class DcController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    private ConsumerService consumerService;

    @GetMapping("/consumer")
    public String dc() throws InterruptedException {
        Thread.sleep(5000L);
        return consumerService.consumer();
    }

    @GetMapping("/balance")
    public String balance() {
        return restTemplate.getForObject("http://eureka-client/test/load/balance", String.class);
    }
}
