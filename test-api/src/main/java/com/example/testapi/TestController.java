package com.example.testapi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/test/hello")
    private String hello() {
        log.debug("hello i am {} port", port);
        return String.format("hello i am %s port", port);
    }
}
