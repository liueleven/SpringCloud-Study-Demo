package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @description: 一定要写注释啊
 * @date: 2018-11-16 17:31
 * @author: 十一
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class FeignApplication {



    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class,args);
    }
}
