package demo.controller;

import demo.client.DcClient;
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
    private DcClient dcClient;

    @GetMapping("/consumer")
    public String dc() {
        return dcClient.consumer();
    }


}
