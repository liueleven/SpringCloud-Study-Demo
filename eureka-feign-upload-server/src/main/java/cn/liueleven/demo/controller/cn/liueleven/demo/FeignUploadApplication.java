package cn.liueleven.demo.controller.cn.liueleven.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @description: 一定要写注释啊
 * @date: 2018-11-16 18:44
 * @author: 十一
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class FeignUploadApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignUploadApplication.class,args);
    }
}
